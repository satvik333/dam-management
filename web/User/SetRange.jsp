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
        <li class="breadcrumb-item active" aria-current="page">Range</li>
    </ol>
</nav>
<section class="main-sec-w3 py-lg-5" style="margin-top: -3em;">
    <div class="container py-sm-5 pt-3 pb-5" style="margin-top: -3em;">
        <div class="wthree-inner-sec">
            <div class="text-center wthree-title pb-sm-5 pb-3">
                <h4 class="w3l-sub">Dam Range</h4>

                <span></span>
            </div>
            <div class="row pt-lg-5 pt-lg-5">
                <div class="col-lg-2">
                </div>
                <div class="col-lg-8" style="border: inset;padding: 3%;margin-top: -4em;">
                    <div class="form-wrapper">
                        <form action="../DamRange" method="post">
                             <%
                               
                                String uid=session.getAttribute("uid").toString();
                                System.out.println(uid);
                                DBsingletone db = DBsingletone.getDbSingletone();
                                Connection con = db.getConnection();
                                PreparedStatement psmt = con.prepareStatement("select * from `dam`  where uid='" + uid + "'");
                                ResultSet rs = psmt.executeQuery();
                                if (rs.next()) {
                                 String did=rs.getString("did");
                                 System.out.println("did"+did);
                                 
                                 PreparedStatement ps=con.prepareStatement("select * from `range`  where did='" + did + "'");
                                ResultSet rs1 = ps.executeQuery();
                                if(rs1.next())
                                {
                              
                            %>
                           
                               <div class="d-flex flex-column">
                                <label>Max InFlow Water Level:</label>
                                <input class="text-input" type="text" name="maxin" value="<%=rs1.getString("maxinflow") %>" id="email" required><p style="    margin-top: -33px;
    margin-left: 231px;">cusecs</p>
                               
                            </div>
                            <div class="d-flex flex-column my-sm-5 my-3">
                                <label>Max OutFlow Water Level:</label>
                                <input class="text-input" type="text" name="maxout" value="<%=rs1.getString("maxoutflow") %>"  id="pass" required ><p style="    margin-top: -33px;
    margin-left: 231px;">cusecs</p>
                               
                            </div>
                            
                              <%
                                }
                                else{
                            
                            %>
                               <div class="d-flex flex-column">
                                <label>Max InFlow Water Level:</label>
                                <input class="text-input" type="text" name="maxin" id="email"  required><p style="    margin-top: -33px;
    margin-left: 231px;">cusecs</p>
                             
                            </div>
                            <div class="d-flex flex-column my-sm-5 my-3">
                                <label>Max OutFlow Water Level:</label>
                                <input class="text-input" type="text" name="maxout"   id="pass" required ><p style="    margin-top: -33px;
    margin-left: 231px;">cusecs</p>
                             
                            </div>
                                <%
                                }
                               
                                %>
                                
                                <%}%>
                            
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