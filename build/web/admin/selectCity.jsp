<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.dbutil.DBsingletone"%>
<%@include file="Header.jsp" %>
<%

    String wid = request.getParameter("wid");
%>
<nav aria-label="breadcrumb">
    <ol class="breadcrumb">
        <li class="breadcrumb-item">
            <a href="home.jsp">Home</a>
        </li>
        <li class="breadcrumb-item active" aria-current="page">Select City</li>
    </ol>
</nav>
<section class="main-sec-w3 py-lg-5" style="margin-top: -3em;">
    <div class="container py-sm-5 pt-3 pb-5" style="margin-top: -3em;">
        <div class="wthree-inner-sec">
            <div class="text-center wthree-title pb-sm-5 pb-3">
                <h4 class="w3l-sub">SELECT City</h4>
                <span></span>
            </div>
            <div class="row pt-lg-5 pt-lg-5">
                <div class="col-lg-12" style="border: inset;padding: 3%;margin-top: -4em;height: 20%;">
                    <div class="form-wrapper">
                        <%
                        String did = request.getParameter("did");
                        %>
                        <input type="hidden" id="did" name="did" value="<%=did%>">
                        <%
                            DBsingletone db = DBsingletone.getDbSingletone();
                            Connection con = db.getConnection();
                            
                            PreparedStatement psmt = con.prepareStatement("SELECT c.`cid`,c.`city_name` FROM `dam` d JOIN `state` s ON s.`state_id`=d.`state` JOIN `city` c ON c.`state`=s.`state_id` WHERE d.did='" + did + "' ");
                            ResultSet rs = psmt.executeQuery();
                            int count = 0;
                            while (rs.next()) {
                                count++;
                        %>
                        <input type="checkbox" name="sel" value="<%=rs.getString("cid")%>">
                        <label><%=rs.getString("city_name")%></label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

                        <%
                            }
                        %>
                        <input class="submit" type="submit" id="save" style="float: right;" onclick="sendcitys()" value="Add City">
                    </div>
                </div>

            </div>
        </div>
    </div>
</section>

<script src="../js/jquery-2.2.3.min.js" type="text/javascript"></script>
<script>
                            $("#save").click(function() {
                                var did=$("#did").val();
                                var id = "";
                                $.each($("input[name='sel']:checked"), function() {
                                    id += "," + $(this).val();
                                });
                                if (id) {
                                    id = id.substring(1);
                                    $.ajax({
                                        url: "../AddAffectedCity",
                                        dataType: 'json',
                                        type: 'POST',
                                        data: {cityid: id, did:did},
                                        success: function(data) {
                                           alert(data);
                                        }
                                    });
                                } else {
                                    alert('Please Choose Atleast one City.');
                                }


                            });

</script>           


