
<!DOCTYPE html>
<html lang="zxx">

    <head>
        <title>Dam Management</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta charset="utf-8" />
        <meta name="keywords" content="Flyer Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
              SmartPhone Compatible web template, free WebDesigns for Nokia, Samsung, LG, Sony Ericsson, Motorola web design" />
        <script>
            addEventListener("load", function () {
            setTimeout(hideURLbar, 0);
            }, false);
                    function hideURLbar() {
                    window.scrollTo(0, 1);
                    }
        </script>
        <!-- Custom Theme files -->
        <link href="../css/bootstrap.css" type="text/css" rel="stylesheet" media="all">
        <link href="../css/style.css" type="text/css" rel="stylesheet" media="all">
        <!-- font-awesome icons -->
        <link href="../css/fontawesome-all.min.css" rel="stylesheet">
        <!-- //Custom Theme files -->
        <!-- online-fonts -->
        <link href="//fonts.googleapis.com/css?family=Nunito+Sans:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
              rel="stylesheet">
        <!-- //online-fonts -->
    </head>

    <body>
        <!-- header -->
        <header>
            <!-- nav -->
            <nav class="main-header">
                <div id="brand">
                    <div id="logo">
                        <a href="index.html">
                            <i class="fa fa-tint"></i>
                        </a>
                    </div>
                    <div id="word-mark">
                        <h1>
                            <a href="home.jsp">Dam Management</a>
                        </h1>
                    </div>
                </div>
                <div id="menu">
                    <div id="menu-toggle">
                        <div id="menu-icon">
                            <div class="bar"></div>
                            <div class="bar"></div>
                            <div class="bar"></div>
                        </div>
                    </div>
                    <ul class="text-center text-capitalize nav-agile" style="width: 150%;">
                        <li>
                            <a href="home.jsp">home</a>
                        </li>
                        <li>
                            <a href="viewDamDetails.jsp" >Dam Details</a>
                        </li>
                        <li>
                            <a href="addcity.jsp" >Add City</a>
                        </li>
                        <li>
                            <a href="viewcity.jsp">View City</a>
                        </li>
                           <li>
                            <a href="viewuser.jsp">View Users</a>
                        </li>
                        
                        <li>
                            <a href="../index.html" class="active">LogOut</a>
                        </li>

                    </ul>
                </div>
            </nav>
            <!-- //nav -->
        </header>
        <div class="inner-banner">
        </div>
        
        <script src="js/jquery-2.2.3.min.js"></script>
        <!-- sticky nav bar -->
        <script>
                    $(() = > {

                    //On Scroll Functionality
                    $(window).scroll(() = > {
                    var windowTop = $(window).scrollTop();
                            windowTop > 100 ? $('nav').addClass('navShadow') : $('nav').removeClass('navShadow');
                            windowTop > 100 ? $('ul.nav-agile').css('top', '100px') : $('ul.nav-agile').css('top',
                            '160px');
                    });
                            //Click Logo To Scroll To Top
                            $('#logo').on('click', () = > {
                    $('html,body').animate({
                    scrollTop: 0
                    }, 500);
                    });
                            //Smooth Scrolling Using Navigation Menu
                            $('a[href*="#"]').on('click', function (e) {
                    $('html,body').animate({
                    scrollTop: $($(this).attr('href')).offset().top - 100
                    }, 500);
                            e.preventDefault();
                    });
                            //Toggle Menu
                            $('#menu-toggle').on('click', () = > {
                    $('#menu-toggle').toggleClass('closeMenu');
                            $('ul').toggleClass('showMenu');
                            $('li').on('click', () = > {
                    $('ul').removeClass('showMenu');
                            $('#menu-toggle').removeClass('closeMenu');
                    });
                    });
                    });        </script>
        <!-- //sticky nav bar -->
        <!-- budget slider -->
        <script>
                    $(document).on('input change', '#budget', function () {
            $('.budget-text').html($(this).val());
            });        </script>
        <!-- budget slider -->
        <!-- smooth-scrolling-of-move-up -->
        <script>
                    $(document).ready(function () {
            /*
             var defaults = {
             containerID: 'toTop', // fading element id
             containerHoverID: 'toTopHover', // fading element hover id
             scrollSpeed: 1200,
             easingType: 'linear' 
             };
             */

            $().UItoTop({
            easingType: 'easeOutQuart'
            });
            });        </script>
        <script src="js/SmoothScroll.min.js"></script>
        <!-- //smooth-scrolling-of-move-up -->
        <!-- start-smooth-scrolling -->
        <script src="js/move-top.js"></script>
        <script src="js/easing.js"></script>
        <script>
                    jQuery(document).ready(function ($) {
            $(".scroll").click(function (event) {
            event.preventDefault();
                    $('html,body').animate({
            scrollTop: $(this.hash).offset().top
            }, 1000);
            });
            });        </script>
        <!-- //end-smooth-scrolling -->
        <!-- script for password match -->
        <script>
                    window.onload = function () {
                    document.getElementById("password1").onchange = validatePassword;
                            document.getElementById("password2").onchange = validatePassword;
                    }

            function validatePassword() {
            var pass2 = document.getElementById("password2").value;
                    var pass1 = document.getElementById("password1").value;
                    if (pass1 != pass2)
                    document.getElementById("password2").setCustomValidity("Passwords Don't Match");
                    else
                    document.getElementById("password2").setCustomValidity('');
                    //empty string means no validation error
            }
        </script>
        <!-- script for password match -->
        <!-- Bootstrap Core JavaScript -->
        <script src="js/bootstrap.js">
        </script>
        <!-- //Bootstrap Core JavaScript -->
    </body>

</html>