package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class User_005fReg_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("        <script src=\"js/jquery-2.2.3.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <!-- Custom Theme files -->\n");
      out.write("        <link href=\"css/bootstrap.css\" type=\"text/css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("        <link href=\"css/style.css\" type=\"text/css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("        <!-- font-awesome icons -->\n");
      out.write("        <link href=\"css/fontawesome-all.min.css\" rel=\"stylesheet\">\n");
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
      out.write("                            <a href=\"index.html\">Dam Management</a>\n");
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
      out.write("                    <ul class=\"text-center text-capitalize nav-agile\">\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"index.html\" class=\"active\">home</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"UserLogin.jsp\">User Login</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"User_Reg.jsp\" style=\"width: 130px;\">User Registration</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <button type=\"button\" class=\"btn w3ls-btn\" data-toggle=\"modal\" aria-pressed=\"false\" data-target=\"#exampleModal\">\n");
      out.write("                                Admin Login\n");
      out.write("                            </button>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("            <!-- //nav -->\n");
      out.write("        </header>\n");
      out.write("        <!-- //header -->\n");
      out.write("        <!-- inner banner -->\n");
      out.write("        <div class=\"inner-banner\">\n");
      out.write("        </div>\n");
      out.write("        <!-- //inner banner -->\n");
      out.write("        <!-- breadcrumbs -->\n");
      out.write("        <nav aria-label=\"breadcrumb\">\n");
      out.write("            <ol class=\"breadcrumb\">\n");
      out.write("                <li class=\"breadcrumb-item\">\n");
      out.write("                    <a href=\"index.html\">Home</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"breadcrumb-item active\" aria-current=\"page\">User Registration</li>\n");
      out.write("            </ol>\n");
      out.write("        </nav>\n");
      out.write("        <!-- //breadcrumbs -->\n");
      out.write("        <!-- contact -->\n");
      out.write("        <section class=\"main-sec-w3 py-lg-5\" style=\"margin-top: -3em;\">\n");
      out.write("            <div class=\"container py-sm-5 pt-3 pb-5\" style=\"margin-top: -3em;\">\n");
      out.write("                <div class=\"wthree-inner-sec\">\n");
      out.write("                    <div class=\"text-center wthree-title pb-sm-5 pb-3\">\n");
      out.write("                        <h4 class=\"w3l-sub\">User Registration</h4>\n");
      out.write("\n");
      out.write("                        <span></span>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row pt-lg-5 pt-lg-5\">\n");
      out.write("                        <div class=\"col-lg-2\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-lg-8\" style=\"border: inset;padding: 3%;margin-top: -4em;\">\n");
      out.write("                            <div class=\"form-wrapper\">\n");
      out.write("                                <form action=\"User_Reg\" method=\"post\" onsubmit=\"return validation()\">\n");
      out.write("\n");
      out.write("                                    <div class=\"d-flex flex-column\">\n");
      out.write("                                        <label>Your Name:</label>\n");
      out.write("                                        <input class=\"text-input\"  maxlength=\"32\" pattern=\"[A-Za-z]{1,32}\"  type=\"text\" name=\"name\" id=\"email\" required>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"d-flex flex-column my-sm-5 my-3\">\n");
      out.write("                                        <label>Your Email:</label>\n");
      out.write("                                        <input class=\"text-input\" type=\"email\"  pattern=\"[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,}$\"  name=\"email\" id=\"email\" required>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"d-flex flex-column my-sm-5 my-3\">\n");
      out.write("                                        <div class=\"message\">\n");
      out.write("                                            <h6>Address</h6>\n");
      out.write("                                        </div>\n");
      out.write("                                        <textarea name=\"add\" id=\"add\" required></textarea>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"d-flex flex-column my-sm-5 my-3\">\n");
      out.write("                                        <label>Contact:</label>\n");
      out.write("                                        <input class=\"text-input\" type=\"number\" id=\"pho\" name=\"pho\"> \n");
      out.write("                                        \n");
      out.write("                                        \n");
      out.write("                                        \n");
      out.write("                                        <!--<input class=\"text-input\" type=\"number\" max=\"10\"  name=\"pho\" id=\"pho\" required>-->\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"d-flex flex-column my-sm-5 my-3\">\n");
      out.write("                                        <label>Dam Name:</label>\n");
      out.write("                                        <input class=\"text-input\" type=\"text\" name=\"dname\" id=\"dname\" required>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"d-flex flex-column my-sm-5 my-3\">\n");
      out.write("                                        <label>Dam Height:</label>\n");
      out.write("                                        <input class=\"text-input\" type=\"text\" name=\"dheight\" id=\"dheight\" required>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"d-flex flex-column my-sm-5 my-3\">\n");
      out.write("                                        <label>Dam length:</label>\n");
      out.write("                                        <input class=\"text-input\" type=\"text\" name=\"dlength\" id=\"dlength\" required>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"d-flex flex-column my-sm-5 my-3\">\n");
      out.write("                                        <label>Dam Opened:</label>\n");
      out.write("                                        <input class=\"text-input\" type=\"date\" name=\"ddate\" id=\"ddate\" required>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"d-flex flex-column my-sm-5 my-3\">\n");
      out.write("                                        <label>State :</label>\n");
      out.write("                                        <select id=\"state\" name=\"state1\" onchange=\"getCity()\" class=\"text-input\" >\n");
      out.write("                                            <option>Select State</option>\n");
      out.write("                                        </select>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"d-flex flex-column my-sm-5 my-3\">\n");
      out.write("                                        <label>City :</label>\n");
      out.write("                                        <select id=\"city\" name=\"dplace\" class=\"text-input\" >\n");
      out.write("                                            <option>Select City</option>\n");
      out.write("                                        </select>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"d-flex flex-column my-sm-5 my-3\">\n");
      out.write("                                        <label>password:</label>\n");
      out.write("                                        <input class=\"text-input\"  minlength=\"4\"   maxlength=\"8\" type=\"password\" name=\"pass\" id=\"pass\" required >\n");
      out.write("                                    </div>\n");
      out.write("                                    <input class=\"submit\" type=\"submit\" value=\"Register\">\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-lg-2\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <div class=\"cpy-right text-center py-4\">\n");
      out.write("            <p class=\"text-white\">© 2019 Dam Management. All rights reserved | Design by\n");
      out.write("                <a href=\"#\" class=\"text-white\"> Dam Management.</a>\n");
      out.write("            </p>\n");
      out.write("        </div>\n");
      out.write("        <!-- //footer -->\n");
      out.write("        <!-- Login modal -->\n");
      out.write("        <div class=\"modal fade\" id=\"exampleModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("            <div class=\"modal-dialog modal-dialog-centered\" role=\"document\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                        <h5 class=\"modal-title\" id=\"exampleModalLabel\">Login</h5>\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                            <span aria-hidden=\"true\">&times;</span>\n");
      out.write("                        </button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-body\">\n");
      out.write("                        <form action=\"Admin_Login\" method=\"post\">\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <label for=\"recipient-name\" class=\"col-form-label\">Username</label>\n");
      out.write("              <input type=\"text\" class=\"form-control border\" placeholder=\" \" name=\"name\" id=\"recipient-name\" required=\"\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <label for=\"password\" class=\"col-form-label\">Password</label>\n");
      out.write("              <input type=\"password\" class=\"form-control border\" placeholder=\" \" name=\"pass\" id=\"password\" required=\"\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"right-w3l\">\n");
      out.write("              <input type=\"submit\" class=\"form-control border text-white btn-theme\" value=\"Login\">\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("          </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- //Login modal -->\n");
      out.write("        <!-- Register modal -->\n");
      out.write("        <div class=\"modal fade\" id=\"exampleModal1\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel1\" aria-hidden=\"true\">\n");
      out.write("            <div class=\"modal-dialog modal-dialog-centered\" role=\"document\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                        <h5 class=\"modal-title\" id=\"exampleModalLabel1\">Register</h5>\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                            <span aria-hidden=\"true\">&times;</span>\n");
      out.write("                        </button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-body\">\n");
      out.write("                        <form action=\"#\" method=\"post\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"recipient-name\" class=\"col-form-label\">Username</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control border\" placeholder=\" \" name=\"Name\" id=\"recipient-rname\" required=\"\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"recipient-email\" class=\"col-form-label\">Email</label>\n");
      out.write("                                <input type=\"email\" class=\"form-control border\" placeholder=\" \" name=\"Email\" id=\"recipient-email\" required=\"\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"password1\" class=\"col-form-label\">Password</label>\n");
      out.write("                                <input type=\"password\" class=\"form-control border\" placeholder=\" \" name=\"Password\" id=\"password1\" required=\"\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"password2\" class=\"col-form-label\">Confirm Password</label>\n");
      out.write("                                <input type=\"password\" class=\"form-control border\" placeholder=\" \" name=\"Confirm Password\" id=\"password2\" required=\"\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"sub-w3l\">\n");
      out.write("                                <div class=\"sub-agile\">\n");
      out.write("                                    <input type=\"checkbox\" id=\"brand2\" value=\"\">\n");
      out.write("                                    <label for=\"brand2\" class=\"mb-3\">\n");
      out.write("                                        <span></span>I Accept to the Terms & Conditions</label>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"right-w3l\">\n");
      out.write("                                <input type=\"submit\" class=\"form-control btn-theme text-white\" value=\"Register\">\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            function validation()\n");
      out.write("            {\n");
      out.write("                var pho = $(\"#pho\").val();\n");
      out.write("                if(pho.length > 10 || pho.length < 10 )\n");
      out.write("                {\n");
      out.write("                    alert(\"valied only 10 digits number\");\n");
      out.write("                    return false;\n");
      out.write("                }else{\n");
      out.write("                    return true;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        <!-- // Register modal -->\n");
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
      out.write("                    });</script>\n");
      out.write("        <!-- //sticky nav bar -->\n");
      out.write("        <!-- budget slider -->\n");
      out.write("        <script>\n");
      out.write("                    $(document).on('input change', '#budget', function () {\n");
      out.write("            $('.budget-text').html($(this).val());\n");
      out.write("            });</script>\n");
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
      out.write("            });</script>\n");
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
      out.write("            });</script>\n");
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
      out.write("        <script>\n");
      out.write("            $(document).ready(function() {\n");
      out.write("            getState();\n");
      out.write("//                    getCity();\n");
      out.write("            });\n");
      out.write("                    function getState() {\n");
      out.write("                    $.ajax({\n");
      out.write("                    url: \"GetState\",\n");
      out.write("                            dataType: 'json',\n");
      out.write("                            type: 'POST',\n");
      out.write("                            data: {meth:\"getstate\"},\n");
      out.write("                            success: function(data) {\n");
      out.write("                            $('#state').empty();\n");
      out.write("                                    var tableContent = \"<option>Select State</option>\";\n");
      out.write("                                    $.each(data, function(idx, obj) {\n");
      out.write("                                    tableContent += \"<option value=\" + obj.sid + \">\" + obj.state + \"</option>\";\n");
      out.write("                                    });\n");
      out.write("                                    $('#state').append(tableContent);\n");
      out.write("                            }\n");
      out.write("                    });\n");
      out.write("                    }\n");
      out.write("            function getCity() {\n");
      out.write("                var bid = $(\"#state\").val();\n");
      out.write("            $.ajax({\n");
      out.write("            url: \"GetState\",\n");
      out.write("                    dataType: 'json',\n");
      out.write("                    type: 'POST',\n");
      out.write("                    data: {meth:\"getcity\",bid:bid},\n");
      out.write("                    success: function(data) {\n");
      out.write("                    $('#city').empty();\n");
      out.write("                            var tableContent = \"<option>Select City</option>\";\n");
      out.write("                            $.each(data, function(idx, obj) {\n");
      out.write("                            tableContent += \"<option value=\" + obj.cid + \">\" + obj.city + \"</option>\";\n");
      out.write("                            });\n");
      out.write("                            $('#city').append(tableContent);\n");
      out.write("                    }\n");
      out.write("            });\n");
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