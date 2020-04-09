package org.apache.jsp.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import com.dbutil.DBsingletone;

public final class SetRange_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/User/Header.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"zxx\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <title>Dam Management</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <meta name=\"keywords\" content=\"Flyer Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, \n");
      out.write("              SmartPhone Compatible web template, free WebDesigns for Nokia, Samsung, LG, Sony Ericsson, Motorola web design\" />\n");
      out.write("        <script>\n");
      out.write("            addEventListener(\"load\", function () {\n");
      out.write("            setTimeout(hideURLbar, 0);\n");
      out.write("            }, false);\n");
      out.write("                    function hideURLbar() {\n");
      out.write("                    window.scrollTo(0, 1);\n");
      out.write("                    }\n");
      out.write("        </script>\n");
      out.write("        <!-- Custom Theme files -->\n");
      out.write("        <link href=\"../css/bootstrap.css\" type=\"text/css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("        <link href=\"../css/style.css\" type=\"text/css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("        <!-- font-awesome icons -->\n");
      out.write("        <link href=\"../css/fontawesome-all.min.css\" rel=\"stylesheet\">\n");
      out.write("        <!-- //Custom Theme files -->\n");
      out.write("        <!-- online-fonts -->\n");
      out.write("        <link href=\"//fonts.googleapis.com/css?family=Nunito+Sans:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i\"\n");
      out.write("              rel=\"stylesheet\">\n");
      out.write("        <!-- //online-fonts -->\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <!-- header -->\n");
      out.write("        <header>\n");
      out.write("            <!-- nav -->\n");
      out.write("            <nav class=\"main-header\">\n");
      out.write("                <div id=\"brand\">\n");
      out.write("                    <div id=\"logo\">\n");
      out.write("                        <a href=\"index.html\">\n");
      out.write("                            <i class=\"fa fa-tint\"></i>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                    <div id=\"word-mark\">\n");
      out.write("                        <h1>\n");
      out.write("                            <a href=\"home.jsp\">Dam Management</a>\n");
      out.write("                        </h1>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"menu\">\n");
      out.write("                    <div id=\"menu-toggle\">\n");
      out.write("                        <div id=\"menu-icon\">\n");
      out.write("                            <div class=\"bar\"></div>\n");
      out.write("                            <div class=\"bar\"></div>\n");
      out.write("                            <div class=\"bar\"></div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <ul class=\"text-center text-capitalize nav-agile\" style=\"width: 100%;\">\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"home.jsp\">home</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"SetRange.jsp\">Set Range</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"addReadings.jsp\" style=\"width: 135%;\">Add Readings</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li style=\"margin-left: 6%;\">\n");
      out.write("                            <a href=\"ViewReadings.jsp\" style=\"width: 100px;\">View Readings</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li style=\"margin-left: 2%;\">\n");
      out.write("                            <a href=\"viewaffectedcitys.jsp\" style=\"width: 140%;\">Affected Cities</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li style=\"margin-left: 7%;\">\n");
      out.write("                            <a href=\"../UserLogin.jsp\" class=\"active\">LogOut</a>\n");
      out.write("                        </li>\n");
      out.write("                        \n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("            <!-- //nav -->\n");
      out.write("        </header>\n");
      out.write("        <div class=\"inner-banner\">\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <script src=\"js/jquery-2.2.3.min.js\"></script>\n");
      out.write("        <!-- sticky nav bar -->\n");
      out.write("        <script>\n");
      out.write("                    $(() = > {\n");
      out.write("\n");
      out.write("                    //On Scroll Functionality\n");
      out.write("                    $(window).scroll(() = > {\n");
      out.write("                    var windowTop = $(window).scrollTop();\n");
      out.write("                            windowTop > 100 ? $('nav').addClass('navShadow') : $('nav').removeClass('navShadow');\n");
      out.write("                            windowTop > 100 ? $('ul.nav-agile').css('top', '100px') : $('ul.nav-agile').css('top',\n");
      out.write("                            '160px');\n");
      out.write("                    });\n");
      out.write("                            //Click Logo To Scroll To Top\n");
      out.write("                            $('#logo').on('click', () = > {\n");
      out.write("                    $('html,body').animate({\n");
      out.write("                    scrollTop: 0\n");
      out.write("                    }, 500);\n");
      out.write("                    });\n");
      out.write("                            //Smooth Scrolling Using Navigation Menu\n");
      out.write("                            $('a[href*=\"#\"]').on('click', function (e) {\n");
      out.write("                    $('html,body').animate({\n");
      out.write("                    scrollTop: $($(this).attr('href')).offset().top - 100\n");
      out.write("                    }, 500);\n");
      out.write("                            e.preventDefault();\n");
      out.write("                    });\n");
      out.write("                            //Toggle Menu\n");
      out.write("                            $('#menu-toggle').on('click', () = > {\n");
      out.write("                    $('#menu-toggle').toggleClass('closeMenu');\n");
      out.write("                            $('ul').toggleClass('showMenu');\n");
      out.write("                            $('li').on('click', () = > {\n");
      out.write("                    $('ul').removeClass('showMenu');\n");
      out.write("                            $('#menu-toggle').removeClass('closeMenu');\n");
      out.write("                    });\n");
      out.write("                    });\n");
      out.write("                    });        </script>\n");
      out.write("        <!-- //sticky nav bar -->\n");
      out.write("        <!-- budget slider -->\n");
      out.write("        <script>\n");
      out.write("                    $(document).on('input change', '#budget', function () {\n");
      out.write("            $('.budget-text').html($(this).val());\n");
      out.write("            });        </script>\n");
      out.write("        <!-- budget slider -->\n");
      out.write("        <!-- smooth-scrolling-of-move-up -->\n");
      out.write("        <script>\n");
      out.write("                    $(document).ready(function () {\n");
      out.write("            /*\n");
      out.write("             var defaults = {\n");
      out.write("             containerID: 'toTop', // fading element id\n");
      out.write("             containerHoverID: 'toTopHover', // fading element hover id\n");
      out.write("             scrollSpeed: 1200,\n");
      out.write("             easingType: 'linear' \n");
      out.write("             };\n");
      out.write("             */\n");
      out.write("\n");
      out.write("            $().UItoTop({\n");
      out.write("            easingType: 'easeOutQuart'\n");
      out.write("            });\n");
      out.write("            });        </script>\n");
      out.write("        <script src=\"js/SmoothScroll.min.js\"></script>\n");
      out.write("        <!-- //smooth-scrolling-of-move-up -->\n");
      out.write("        <!-- start-smooth-scrolling -->\n");
      out.write("        <script src=\"js/move-top.js\"></script>\n");
      out.write("        <script src=\"js/easing.js\"></script>\n");
      out.write("        <script>\n");
      out.write("                    jQuery(document).ready(function ($) {\n");
      out.write("            $(\".scroll\").click(function (event) {\n");
      out.write("            event.preventDefault();\n");
      out.write("                    $('html,body').animate({\n");
      out.write("            scrollTop: $(this.hash).offset().top\n");
      out.write("            }, 1000);\n");
      out.write("            });\n");
      out.write("            });        </script>\n");
      out.write("        <!-- //end-smooth-scrolling -->\n");
      out.write("        <!-- script for password match -->\n");
      out.write("        <script>\n");
      out.write("                    window.onload = function () {\n");
      out.write("                    document.getElementById(\"password1\").onchange = validatePassword;\n");
      out.write("                            document.getElementById(\"password2\").onchange = validatePassword;\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("            function validatePassword() {\n");
      out.write("            var pass2 = document.getElementById(\"password2\").value;\n");
      out.write("                    var pass1 = document.getElementById(\"password1\").value;\n");
      out.write("                    if (pass1 != pass2)\n");
      out.write("                    document.getElementById(\"password2\").setCustomValidity(\"Passwords Don't Match\");\n");
      out.write("                    else\n");
      out.write("                    document.getElementById(\"password2\").setCustomValidity('');\n");
      out.write("                    //empty string means no validation error\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        <!-- script for password match -->\n");
      out.write("        <!-- Bootstrap Core JavaScript -->\n");
      out.write("        <script src=\"js/bootstrap.js\">\n");
      out.write("        </script>\n");
      out.write("        <!-- //Bootstrap Core JavaScript -->\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>");
      out.write("\n");
      out.write("<nav aria-label=\"breadcrumb\">\n");
      out.write("    <ol class=\"breadcrumb\">\n");
      out.write("        <li class=\"breadcrumb-item\">\n");
      out.write("            <a href=\"home.jsp\">Home</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"breadcrumb-item active\" aria-current=\"page\">Range</li>\n");
      out.write("    </ol>\n");
      out.write("</nav>\n");
      out.write("<section class=\"main-sec-w3 py-lg-5\" style=\"margin-top: -3em;\">\n");
      out.write("    <div class=\"container py-sm-5 pt-3 pb-5\" style=\"margin-top: -3em;\">\n");
      out.write("        <div class=\"wthree-inner-sec\">\n");
      out.write("            <div class=\"text-center wthree-title pb-sm-5 pb-3\">\n");
      out.write("                <h4 class=\"w3l-sub\">Dam Range</h4>\n");
      out.write("\n");
      out.write("                <span></span>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row pt-lg-5 pt-lg-5\">\n");
      out.write("                <div class=\"col-lg-2\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-8\" style=\"border: inset;padding: 3%;margin-top: -4em;\">\n");
      out.write("                    <div class=\"form-wrapper\">\n");
      out.write("                        <form action=\"../DamRange\" method=\"post\">\n");
      out.write("                             ");

                               
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
                              
                            
      out.write("\n");
      out.write("                           \n");
      out.write("                               <div class=\"d-flex flex-column\">\n");
      out.write("                                <label>Max InFlow Water Level:</label>\n");
      out.write("                                <input class=\"text-input\" type=\"text\" name=\"maxin\" value=\"");
      out.print(rs1.getString("maxinflow") );
      out.write("\" id=\"email\" required>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"d-flex flex-column my-sm-5 my-3\">\n");
      out.write("                                <label>Max OutFlow Water Level:</label>\n");
      out.write("                                <input class=\"text-input\" type=\"text\" name=\"maxout\" value=\"");
      out.print(rs1.getString("maxoutflow") );
      out.write("\"  id=\"pass\" required >\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                              ");

                                }
                                else{
                            
                            
      out.write("\n");
      out.write("                               <div class=\"d-flex flex-column\">\n");
      out.write("                                <label>Max InFlow Water Level:</label>\n");
      out.write("                                <input class=\"text-input\" type=\"text\" name=\"maxin\" id=\"email\" required>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"d-flex flex-column my-sm-5 my-3\">\n");
      out.write("                                <label>Max OutFlow Water Level:</label>\n");
      out.write("                                <input class=\"text-input\" type=\"text\" name=\"maxout\"   id=\"pass\" required >\n");
      out.write("                            </div>\n");
      out.write("                                ");

                                }
                               
                                
      out.write("\n");
      out.write("                                \n");
      out.write("                                ");
}
      out.write("\n");
      out.write("                            \n");
      out.write("                          <input class=\"submit\" type=\"submit\" value=\"Add Here\">\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-2\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</section>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
