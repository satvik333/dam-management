
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
        <script src="js/jquery-2.2.3.min.js" type="text/javascript"></script>
        <!-- Custom Theme files -->
        <link href="css/bootstrap.css" type="text/css" rel="stylesheet" media="all">
        <link href="css/style.css" type="text/css" rel="stylesheet" media="all">
        <!-- font-awesome icons -->
        <link href="css/fontawesome-all.min.css" rel="stylesheet">
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
                            <a href="index.html">Dam Management</a>
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
                    <ul class="text-center text-capitalize nav-agile">
                        <li>
                            <a href="index.html" class="active">home</a>
                        </li>
                        <li>
                            <a href="UserLogin.jsp">User Login</a>
                        </li>
                        <li>
                            <a href="User_Reg.jsp" style="width: 130px;">User Registration</a>
                        </li>
                        <li>
                            <button type="button" class="btn w3ls-btn" data-toggle="modal" aria-pressed="false" data-target="#exampleModal">
                                Admin Login
                            </button>
                        </li>
                    </ul>
                </div>
            </nav>
            <!-- //nav -->
        </header>
        <!-- //header -->
        <!-- inner banner -->
        <div class="inner-banner">
        </div>
        <!-- //inner banner -->
        <!-- breadcrumbs -->
        <nav aria-label="breadcrumb">
            <ol class="breadcrumb">
                <li class="breadcrumb-item">
                    <a href="index.html">Home</a>
                </li>
                <li class="breadcrumb-item active" aria-current="page">User Registration</li>
            </ol>
        </nav>
        <!-- //breadcrumbs -->
        <!-- contact -->
        <section class="main-sec-w3 py-lg-5" style="margin-top: -3em;">
            <div class="container py-sm-5 pt-3 pb-5" style="margin-top: -3em;">
                <div class="wthree-inner-sec">
                    <div class="text-center wthree-title pb-sm-5 pb-3">
                        <h4 class="w3l-sub">User Registration</h4>

                        <span></span>
                    </div>
                    <div class="row pt-lg-5 pt-lg-5">
                        <div class="col-lg-2">
                        </div>
                        <div class="col-lg-8" style="border: inset;padding: 3%;margin-top: -4em;">
                            <div class="form-wrapper">
                                <form action="User_Reg" method="post" onsubmit="return validation()">

                                    <div class="d-flex flex-column">
                                        <label>Your Name:</label>
                                        <input class="text-input"  maxlength="32" pattern="[A-Za-z]{1,32}"  type="text" name="name" id="email" required>
                                    </div>
                                    <div class="d-flex flex-column my-sm-5 my-3">
                                        <label>Your Email:</label>
                                        <input class="text-input" type="email"  pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$"  name="email" id="email" required>
                                    </div>
                                    <div class="d-flex flex-column my-sm-5 my-3">
                                        <div class="message">
                                            <h6>Address</h6>
                                        </div>
                                        <textarea name="add" id="add" required></textarea>
                                    </div>
                                    <div class="d-flex flex-column my-sm-5 my-3">
                                        <label>Contact:</label>
                                        <input class="text-input" type="number" id="pho" name="pho"> 
                                        
                                        
                                        
                                        <!--<input class="text-input" type="number" max="10"  name="pho" id="pho" required>-->
                                    </div>
                                    <div class="d-flex flex-column my-sm-5 my-3">
                                        <label>Dam Name:</label>
                                        <input class="text-input" type="text" name="dname" id="dname" required>
                                    </div>
                                    <div class="d-flex flex-column my-sm-5 my-3">
                                        <label>Dam Height:</label>
                                        <input class="text-input" type="text" name="dheight" id="dheight" required>
                                    </div>
                                    <div class="d-flex flex-column my-sm-5 my-3">
                                        <label>Dam length:</label>
                                        <input class="text-input" type="text" name="dlength" id="dlength" required>
                                    </div>
                                    <div class="d-flex flex-column my-sm-5 my-3">
                                        <label>Dam Opened:</label>
                                        <input class="text-input" type="date" name="ddate" id="ddate" required>
                                    </div>
                                    <div class="d-flex flex-column my-sm-5 my-3">
                                        <label>State :</label>
                                        <select id="state" name="state1" onchange="getCity()" class="text-input" >
                                            <option>Select State</option>
                                        </select>
                                    </div>
                                    <div class="d-flex flex-column my-sm-5 my-3">
                                        <label>City :</label>
                                        <select id="city" name="dplace" class="text-input" >
                                            <option>Select City</option>
                                        </select>
                                    </div>

                                    <div class="d-flex flex-column my-sm-5 my-3">
                                        <label>password:</label>
                                        <input class="text-input"  minlength="4"   maxlength="8" type="password" name="pass" id="pass" required >
                                    </div>
                                    <input class="submit" type="submit" value="Register">
                                </form>
                            </div>
                        </div>
                        <div class="col-lg-2">
                        </div>
                    </div>
                </div>
            </div>
        </section>

        <div class="cpy-right text-center py-4">
            <p class="text-white">© 2019 Dam Management. All rights reserved | Design by
                <a href="#" class="text-white"> Dam Management.</a>
            </p>
        </div>
        <!-- //footer -->
        <!-- Login modal -->
        <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog modal-dialog-centered" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel">Login</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        <form action="Admin_Login" method="post">
            <div class="form-group">
              <label for="recipient-name" class="col-form-label">Username</label>
              <input type="text" class="form-control border" placeholder=" " name="name" id="recipient-name" required="">
            </div>
            <div class="form-group">
              <label for="password" class="col-form-label">Password</label>
              <input type="password" class="form-control border" placeholder=" " name="pass" id="password" required="">
            </div>
            <div class="right-w3l">
              <input type="submit" class="form-control border text-white btn-theme" value="Login">
            </div>
            
            
          </form>
                    </div>
                </div>
            </div>
        </div>
        <!-- //Login modal -->
        <!-- Register modal -->
        <div class="modal fade" id="exampleModal1" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel1" aria-hidden="true">
            <div class="modal-dialog modal-dialog-centered" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel1">Register</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        <form action="#" method="post">
                            <div class="form-group">
                                <label for="recipient-name" class="col-form-label">Username</label>
                                <input type="text" class="form-control border" placeholder=" " name="Name" id="recipient-rname" required="">
                            </div>
                            <div class="form-group">
                                <label for="recipient-email" class="col-form-label">Email</label>
                                <input type="email" class="form-control border" placeholder=" " name="Email" id="recipient-email" required="">
                            </div>
                            <div class="form-group">
                                <label for="password1" class="col-form-label">Password</label>
                                <input type="password" class="form-control border" placeholder=" " name="Password" id="password1" required="">
                            </div>
                            <div class="form-group">
                                <label for="password2" class="col-form-label">Confirm Password</label>
                                <input type="password" class="form-control border" placeholder=" " name="Confirm Password" id="password2" required="">
                            </div>
                            <div class="sub-w3l">
                                <div class="sub-agile">
                                    <input type="checkbox" id="brand2" value="">
                                    <label for="brand2" class="mb-3">
                                        <span></span>I Accept to the Terms & Conditions</label>
                                </div>
                            </div>
                            <div class="right-w3l">
                                <input type="submit" class="form-control btn-theme text-white" value="Register">
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <script>
            
            
            function validation()
            {
                var pho = $("#pho").val();
                if(pho.length > 10 || pho.length < 10 )
                {
                    alert("valied only 10 digits number");
                    return false;
                }else{
                    return true;
                }
            }
        </script>
        <!-- // Register modal -->
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
                    });</script>
        <!-- //sticky nav bar -->
        <!-- budget slider -->
        <script>
                    $(document).on('input change', '#budget', function () {
            $('.budget-text').html($(this).val());
            });</script>
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
            });</script>
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
            });</script>
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
        <script>
            $(document).ready(function() {
            getState();
//                    getCity();
            });
                    function getState() {
                    $.ajax({
                    url: "GetState",
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
            function getCity() {
                var bid = $("#state").val();
            $.ajax({
            url: "GetState",
                    dataType: 'json',
                    type: 'POST',
                    data: {meth:"getcity",bid:bid},
                    success: function(data) {
                    $('#city').empty();
                            var tableContent = "<option>Select City</option>";
                            $.each(data, function(idx, obj) {
                            tableContent += "<option value=" + obj.cid + ">" + obj.city + "</option>";
                            });
                            $('#city').append(tableContent);
                    }
            });
            }
        </script>
        <!-- script for password match -->
        <!-- Bootstrap Core JavaScript -->
        <script src="js/bootstrap.js">
        </script>
        <!-- //Bootstrap Core JavaScript -->
    </body>

</html>