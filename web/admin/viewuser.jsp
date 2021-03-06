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
        <li class="breadcrumb-item active" aria-current="page">View City</li>
    </ol>
</nav>
<section class="main-sec-w3 py-lg-5" style="margin-top: -3em;">
    <div class="container py-sm-5 pt-3 pb-5" style="margin-top: -3em;">
        <div class="wthree-inner-sec">
            <div class="text-center wthree-title pb-sm-5 pb-3">
                <h4 class="w3l-sub">User List</h4>

                <span></span>
            </div>
            <div class="row pt-lg-5 pt-lg-5">
                <!--                <div class="col-lg-2">
                                </div>-->
                <div class="col-lg-12" style="border: inset;padding: 1%;margin-top: -4em;">
                    <div class="form-wrapper">
                        <table class="table" id="allrooms">
                            <!--<table class="table" id="markspanel" style="width: 50em;margin-left: 12em">-->
                            <thead style="background-color: #202021f2;">
                                <tr>
                                    <th style="color:white;text-align: center">Sl NO</th>
                                    <th style="color:white;text-align: center">Name</th>
                                    <th style="color:white;text-align: center">Mail-Id</th>
                                     <th style="color:white;text-align: center">Address</th>
                                      <th style="color:white;text-align: center">Contact</th>
                                    <th style="color:white;text-align: center">Action</th>
                                </tr>
                            </thead>
                            <tbody style="color: white;  text-align: center;  background-color: #131c25d1;">

                                <%
                                    DBsingletone db = DBsingletone.getDbSingletone();
                                    Connection con = db.getConnection();
                                    PreparedStatement psmt = con.prepareStatement("SELECT * from users");
                                    ResultSet rs = psmt.executeQuery();
                                    int count = 0;
                                    while (rs.next()) {
                                        count++;
                                %>
                                <tr>
                                    <td style="color:white"><%=count%></td>
                                    <td style="color:white"><%=rs.getString("uname")%></td>
                                    <td style="color:white"><%=rs.getString("umail")%></td>
                                    <td style="color:white"><%=rs.getString("uadd")%></td>
                                    <td style="color:white"><%=rs.getString("upho")%></td>

                                    <td><button type="button"  onclick="Delete(<%=rs.getString("uid")%>)" class="btn btn-danger btn-sm"><i class="fa fa-trash-alt"></i></button></td>


                                </tr>
                                <%
                                    }
                                %>
                            </tbody>
                        </table>
                    </div>
                </div>
                <!--                <div class="col-lg-2">
                                </div>-->
            </div>
        </div>
    </div>
</section>
<script>
    function edit(id) {
        window.location.href = "update_City.jsp?id=" + id + "";
    }
    function Delete(id) {
        var res = confirm("Are You Sure You Want To Delete.....!");
        if (res) {
            window.location.href = "../rejectuser?id=" + id + "";
        }
    }

</script>
