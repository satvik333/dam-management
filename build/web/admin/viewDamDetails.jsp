
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
                <h4 class="w3l-sub">Dam Readings</h4>

                <span></span>
            </div>
            <div class="row" style="margin-top: -2%;">
                <div class="col-md-3"></div>
                <div class="col-6">
                    <div class="d-flex flex-column">
                        <label>Select Date:</label>
                        <input class="text-input" type="date" name="date" id="date" required onchange="getdata()">
                    </div>
                </div>
                <div class="col-md-3"></div>
            </div>


            <div class="row pt-lg-5 pt-lg-5" style="margin-top: 5%;">

                <div class="col-lg-12" style="border: inset;padding: 1%;margin-top: -4em;">
                    <div class="form-wrapper">
                        <table class="table" id="allrooms">
                            <!--<table class="table" id="markspanel" style="width: 50em;margin-left: 12em">-->
                            <thead style="background-color: #202021f2;">
                                <tr>
                                    <th style="color:white;text-align: center">Sl NO</th>
                                    <th style="color:white;text-align: center">Dam Name</th>
                                    <th style="color:white;text-align: center">Current InFlow(cusecs)</th>
                                    <th style="color:white;text-align: center">Current OutFlow(cusecs)</th>
                                    <th style="color:white;text-align: center">Date OF Added</th>
                                    <th style="color:white;text-align: center">Max InFlow(cusecs)</th>
                                    <th style="color:white;text-align: center">Max OutFlow(cusecs)</th>
                                    <th style="color:white;text-align: center">Action</th>

                                </tr>
                            </thead>
                            <tbody style="color: white;  text-align: center;  background-color: #131c25d1;">


                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
<script src="../js/jquery-2.2.3.min.js" type="text/javascript"></script>
<script>
                            function getdata() {
                                var date = $("#date").val();
                                $.ajax({
                                    url: "../DamDetailsByDate",
                                    type: 'POST',
                                    dataType: 'json',
                                    data: {date: date},
                                    success: function(data) {
                                        var td = "";
                                        var cnt = 0;
                                        $.each(data, function(idx, obj) {
                                            cnt++;
                                            var one = obj.one;
                                            var two = obj.two;
                                            var one_one = obj.one_one;
                                            var two_two = obj.two_two;
                                            td += "<tr>";
                                            td += "<td>" + cnt + "</td>";
                                            td += "<td>" + obj.dname + "</td>";
                                            td += "<td>" + obj.inflow + "</td>";
                                            td += "<td>" + obj.outflow + "</td>";
                                            td += "<td>" + obj.date + "</td>";
                                            td += "<td>" + obj.max_inflow + "</td>";
                                            td += "<td>" + obj.max_outflow + "</td>";
                                            
                                            if(one > one_one || two > two_two){
                                                td += "<td style=\"width:25%;\"><a href=\"selectCity.jsp?did="+obj.did+"&wid="+obj.wid+"\"><img src=\"tenor.gif\" style=\"width:35%;\"></a></td>";
                                            }else{
                                                td += "<td><button type='button' onclick='click()' class=\"btn btn-primary btn-sm\">NORMAL</button></td>";
                                            }

                                            td += "</tr>";
                                        });
                                        $("#allrooms tbody").empty();
                                        $("#allrooms tbody").append(td);
                                    }
                                });
                            }
</script>