<%@include file="Header.jsp" %>
<nav aria-label="breadcrumb">
    <ol class="breadcrumb">
        <li class="breadcrumb-item">
            <a href="home.jsp">Home</a>
        </li>
        <li class="breadcrumb-item active" aria-current="page">Readings</li>
    </ol>
</nav>
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
                        <form action="../Damreadings" method="post">
                            <div class="d-flex flex-column">
                                <label>Date :</label>
                                <input class="text-input" type="text" name="date" id="date" readonly="">
                            </div>
                            <div class="d-flex flex-column  my-sm-5 my-3">
                                <label>Current InFlow Water Level:</label>
                                <input class="text-input" type="text" name="maxin" id="email" required>
                                <p style="    margin-top: -33px;
    margin-left: 231px;">cusecs</p>
                            </div>
                            <div class="d-flex flex-column my-sm-5 my-3">
                                <label>Current OutFlow Water Level:</label>
                                <input class="text-input" type="text" name="maxout" id="pass" required >
                                <p style="    margin-top: -33px;
    margin-left: 231px;">cusecs</p>
                            </div>
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
<script type="text/javascript">
    $(document).ready(function() {
        
        var today = new Date();
        var dd = String(today.getDate()).padStart(2, '0');
        var mm = String(today.getMonth() + 1).padStart(2, '0'); //January is 0!
        var yyyy = today.getFullYear();

        today = dd + '/' + mm + '/' + yyyy;
        
        $("#date").val(today);
    });

</script>>