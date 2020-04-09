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
        <li class="breadcrumb-item active" aria-current="page">Affected Cities</li>
    </ol>
</nav>
<section class="main-sec-w3 py-lg-5" style="margin-top: -3em;">
    <div class="container py-sm-5 pt-3 pb-5" style="margin-top: -3em;">
        <div class="wthree-inner-sec">
            <div class="text-center wthree-title pb-sm-5 pb-3">
                <h4 class="w3l-sub">Affected Cities</h4>

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
                                    <th style="color:white;text-align: center">State</th>
                                    <th style="color:white;text-align: center">City</th>
                                </tr>
                            </thead>
                            <tbody style="color: white;  text-align: center;  background-color: #131c25d1;">

                                <%
                                    DBsingletone db = DBsingletone.getDbSingletone();
                                    Connection con = db.getConnection();
                                    String uid = session.getAttribute("uid").toString();
                                    PreparedStatement psmt = con.prepareStatement("SELECT ac.`cid` as cid FROM `affected_city` ac JOIN `dam` d ON d.`did`=ac.`did` JOIN `users` u ON u.`uid`=d.`uid` WHERE u.`uid`='" + uid + "'");
                                    ResultSet rs = psmt.executeQuery();
                                    int count = 0;
                                    while (rs.next()) {
                                        
                                        String[] cid = rs.getString("cid").split(",");
                                        for (int i = 0; i < cid.length; i++) {
                                            count++;
                                            PreparedStatement psmt1 = con.prepareStatement("SELECT c.`city_name`,s.`state` FROM `city` c JOIN `state` s ON s.`state_id`=c.`state` WHERE c.`cid`='" + cid[i] + "'");
                                            ResultSet rs1 = psmt1.executeQuery();
                                            while (rs1.next()) {


                                %>
                                <tr>
                                    <td style="color:white"><%=count%></td>
                                    <td style="color:white"><%=rs1.getString("state")%></td>
                                    <td style="color:white"><%=rs1.getString("city_name")%></td>
                                </tr>
                                <%

                                            }
                                        }
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
    function additems(id) {
        window.location.href = "update_Readings.jsp?id=" + id + "";
    }
    function Delete(id) {
        var res = confirm("Are You Sure You Want To Delete.....!");
        if (res) {
            window.location.href = "../deleteReading?id=" + id + "";
        }
    }

</script>
