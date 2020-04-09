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
        <li class="breadcrumb-item active" aria-current="page">Readings</li>
    </ol>
</nav>
<%
    String wid = request.getParameter("id");
%>
<section class="main-sec-w3 py-lg-5" style="margin-top: -3em;">
    <div class="container py-sm-5 pt-3 pb-5" style="margin-top: -3em;">
        <div class="wthree-inner-sec">
            <div class="text-center wthree-title pb-sm-5 pb-3">
                <h4 class="w3l-sub">Dam Readings</h4>

                <span></span>
            </div>
            <div class="row pt-lg-5 pt-lg-5">
                <div class="col-lg-2">
                </div>
                <div class="col-lg-8" style="border: inset;padding: 3%;margin-top: -4em;">
                    <div class="form-wrapper">
                        <form action="../UpdateDamReadings" method="post">
                            <%
                                DBsingletone db = DBsingletone.getDbSingletone();
                                Connection con = db.getConnection();
                                PreparedStatement psmt = con.prepareStatement("SELECT * from water_level where wid='" + wid + "'");
                                ResultSet rs = psmt.executeQuery();
                                if (rs.next()) {
                            %>
                            <div class="d-flex flex-column">
                                <label>Date :</label>
                                <input class="text-input" type="text" name="date" id="date" readonly="">
                            </div>
                            <div class="d-flex flex-column  my-sm-5 my-3">
                                <label>Current InFlow Water Level:</label>
                                <input class="text-input" type="text" name="maxin" value="<%=rs.getString("inflow")%>" id="email" required>
                                <input class="text-input" type="hidden" name="wid" value="<%=wid%>" id="wid" required>
                            </div>
                            <div class="d-flex flex-column my-sm-5 my-3">
                                <label>Current OutFlow Water Level:</label>
                                <input class="text-input" type="text" name="maxout" value="<%=rs.getString("outflow")%>" id="pass" required >
                            </div>
                            <%
                                }
                            %>
                            <input class="submit" type="submit" value="Update">
                        </form>
                    </div>
                </div>
                <div class="col-lg-2">
                </div>
            </div>
        </div>
    </div>
</section>
                            