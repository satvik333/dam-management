<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.dbutil.DBsingletone"%>
<%@include file="Header.jsp" %>
<nav aria-label="breadcrumb">
    <ol class="breadcrumb">
        <li class="breadcrumb-item">
            <a href="home.jsp">Home</a>
        </li>
        <li class="breadcrumb-item active" aria-current="page">City</li>
    </ol>
</nav>
<%
    String cid = request.getParameter("id");
%>
<section class="main-sec-w3 py-lg-5" style="margin-top: -3em;">
    <div class="container py-sm-5 pt-3 pb-5" style="margin-top: -3em;">
        <div class="wthree-inner-sec">
            <div class="text-center wthree-title pb-sm-5 pb-3">
                <h4 class="w3l-sub">Update City</h4>

                <span></span>
            </div>
            <div class="row pt-lg-5 pt-lg-5">
                <div class="col-lg-2">
                </div>
                <div class="col-lg-8" style="border: inset;padding: 3%;margin-top: -4em;">
                    <div class="form-wrapper">
                        <form action="../UpdateCity" method="post">
                            <%
                                DBsingletone db = DBsingletone.getDbSingletone();
                                Connection con = db.getConnection();
                                PreparedStatement psmt = con.prepareStatement("SELECT * from city where cid='" + cid + "'");
                                ResultSet rs = psmt.executeQuery();
                                if (rs.next()) {
                            %>

                            <div class="d-flex flex-column">
                                <label>State :</label>
                                <select id="state" name="state1" class="text-input" >
                                    <option>Select State</option>
                                </select>
                            </div>
                            <div class="d-flex flex-column my-sm-5 my-3">
                                <label>City :</label>
                                <input class="text-input" type="hidden" name="cid" value="<%=cid%>" id="cid" required>
                                <input class="text-input" type="text" name="city" value="<%=rs.getString("city_name")%>" id="city" required >
                            </div>
                            <%
                                }
                            %>
                            <input class="submit" type="submit" value="Add Here">
                        </form>
                    </div>
                </div>
                <div class="col-lg-2">
                </div>
            </div>
        </div>
    </div>
</section>
<script src="../js/jquery-2.2.3.min.js" type="text/javascript"></script>
<script>
    $(document).ready(function() {
        getState();
    });
    function getState() {
        $.ajax({
            url: "../GetState",
            dataType: 'json',
            type: 'POST',
            data: {meth:"getstate"},
            success: function(data) {
                $('#state').empty();
                var tableContent = "<option>Select State</option>";
                $.each(data, function(idx, obj) {
                    tableContent += "<option value=" + obj.sid + ">" + obj.state + "</option>";
                });
                $('#state').append(tableContent);
            }
        });
    }
</script>