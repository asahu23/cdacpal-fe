<%-- 
    Document   : dac
    Created on : Dec 21, 2019, 9:17:46 PM
    Author     : nicea
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zxx">

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <meta charset="utf-8">
  <title>CDacPal</title>

  <!-- mobile responsive meta -->
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  
  <!-- ** Plugins Needed for the Project ** -->
  <!-- Bootstrap -->
  <link rel="stylesheet" href="plugins/bootstrap/bootstrap.min.css">
  <!-- slick slider -->
  <link rel="stylesheet" href="plugins/slick/slick.css">
  <!-- themefy-icon -->
  <link rel="stylesheet" href="plugins/themify-icons/themify-icons.css">
  <!-- animation css -->
  <link rel="stylesheet" href="plugins/animate/animate.css">
  <!-- aos -->
  <link rel="stylesheet" href="plugins/aos/aos.css">
  <!-- venobox popup -->
  <link rel="stylesheet" href="plugins/venobox/venobox.css">

  <!-- Main Stylesheet -->
  <link href="css/style.css" rel="stylesheet">
  
  <!--Favicon-->
  <link rel="shortcut icon" href="images/favicon.ico" type="image/x-icon">
  <link rel="icon" href="images/favicon.ico" type="image/x-icon">

</head>

<body onload="myFunction() id ="body" ">
  

            
  <!-- navbar -->
  <div class="navigation w-100">
    <div class="container">
      <nav class="navbar navbar-expand-lg navbar-light p-0">
        <a class="navbar-brand" href="index.html"><img src="images/logo.png" alt="logo"></a>
        <button class="navbar-toggler rounded-0" type="button" data-toggle="collapse" data-target="#navigation"
          aria-controls="navigation" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>

          <div class="collapse navbar-collapse" id="navigation">
          <ul class="navbar-nav ml-auto text-center">
            <li class="nav-item active">
              <a class="nav-link" href="index_after_login.jsp">Home</a>
            </li>
          </ul>
        </div>
      </nav>
    </div>
  </div>
</header>
<!-- /header -->
<!-- Modal -->

<!-- page title -->
<section class="page-title-section overlay" data-background="images/backgrounds/page-title.jpg">
  <div class="container">
    <div class="row">
      <div class="col-md-8">
        <ul class="list-inline custom-breadcrumb">
          <li class="list-inline-item"><a class="h2 text-primary font-secondary" href="@@page-link">PG-DAC</a></li>
          <li class="list-inline-item text-white h3 font-secondary @@nasted"></li>
        </ul>
        <p class="text-lighten">The Post Graduate Diploma in Advanced Computing (PG-DAC) is the flagship programme of ACTS. The course is targeted towards engineers and IT professionals who wish to venture into the domain of advanced computing. The course aims to groom the students to enable them to work on current technology scenarios as well as prepare them to keep pace with the changing face of technology and the requirements of the growing IT industry. The course curriculum has been designed keeping in view the emerging trends in advanced computing as well as contemporary and futuristic human resource requirements of the ICT industry. The entire course syllabus, course ware, teaching methodology and the course delivery have been derived from the rich research and development background of C-DAC. The depth and width of the course is unique in the industry covering a wide spectrum of requirements of the ICT industry. Running successfully for more than seventeen years, the PG-DAC course has yielded more than quarter million of students, who are well positioned in the industry today.</p>
      </div>
    </div>
  </div>
</section>

<section>
    <div> 
         
          <br></br> <br></br>
    
    <table align = "center"
            id="table" border="2" cellspacing="2" cellpadding="7"> 
    </table> 
    </div>     
</section>



<!-- /page title -->

<!-- teachers -->
<section class="section">
  <div data-ref="mixitup-target" class="container">
    <div class="row">
      <div class="col-12">
        <!-- teacher category list -->
        <ul class="list-inline text-center filter-controls mb-5">
          
        </ul>
      </div>
    </div>
    
        </div>
    
</section>
<!-- /teachers -->

<!-- footer -->
<footer>
 
   <!-- footer content -->
  <div class="footer bg-footer section border-bottom">
    <div class="container">
      <div class="row">
        <div class="col-lg-8 col-sm-8 mb-10 mb-lg-0">
          <!-- logo -->
          <a class="logo-footer" href="index.html"><img class="img-fluid mb-4" src="images/logo.png" alt="logo"></a>
          <ul class="list-unstyled">
            <li class="mb-2">Plot No. 6 & 7, Hardware Park,Sy No. 1/1</li>
            <li class="mb-2">Srisailam Highway</li>
            <li class="mb-2">Hyderabad</li>
            
          </ul>
        </div>
                <!-- links -->
        <div class="col-lg-2 col-md-3 col-sm-4 col-6 mb-5 mb-md-0">
          <h4 class="text-white mb-10">LINKS</h4>
          <ul class="list-unstyled">
            <li class="mb-3"><a class="text-color" href="seeAll.html">CDAC Courses</a></li>
            
            
          </ul>
        </div>
       
      </div>
    </div>
  </div>
  
</footer>
<!-- /footer -->

<!-- jQuery -->

<script src="plugins/jQuery/jquery.min.js"></script>
<!-- Bootstrap JS -->
<script src="plugins/bootstrap/bootstrap.min.js"></script>
<!-- slick slider -->
<script src="plugins/slick/slick.min.js"></script>
<!-- aos -->
<script src="plugins/aos/aos.js"></script>
<!-- venobox popup -->
<script src="plugins/venobox/venobox.min.js"></script>
<!-- mixitup filter -->
<script src="plugins/mixitup/mixitup.min.js"></script>
<!-- google map -->
<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCcABaamniA6OL5YvYSpB3pFMNrXwXnLwU&libraries=places"></script>
<script src="plugins/google-map/gmap.js"></script>

<!-- Main Script -->
<script src="js/script.js"></script>



 <script>
    
    
  function myFunction() {    
            
                console.log('hii')
                 var output ;
                $.ajax({
                    type: "get",
                    url: 'http://localhost:8083/cdacpal/getcoursematerial?courseid=1',
                    
                    success: function (response) {
                        console.log(response);
                        //var data = JSON.parse(response);
                        
//                        document.getElementById("para").innerHTML = "Click on the button to create " 
//                                                            +   "the table from the JSON data.<br><br>" 
//                                                                    + JSON.stringify(response[0]) + "<br>"  
//                                                                    + JSON.stringify(response[1]) + "<br>" 
//                                                                    + JSON.stringify(response[2]);+ "<br>"
//                                                                    + JSON.stringify(response[2]);
//                                      
                                                    selector= document.getElementById("table"); 
              
                                                         // Getting the all column names 
                                                          var cols = Headers(response, selector);   
   
                                                        // Traversing the JSON data 
                                                        console.log("Response",response)
                                             for (var i = 0; i < response.length; i++) { 
                                              var row = $('<tr/>');    
                                               for (var colIndex = 0; colIndex < cols.length; colIndex++) 
                                               { 
                                                    var val = response[i][cols[colIndex]];
                                                        if(colIndex == 3)
                                                        {   
                                                            console.log("out", val)
                                                            val = '<a href='+val+'>'+val+'</a>'
                                                        }
                                                    // If there is any key, which is matching 
                                                    // with the column name 
                                                    if (val == null) val = "";   
                                                     row.append($('<td/>').html(val)); 
                                                     
                                                    
                                                     
                                                     } 
                  
                                                             // Adding each row to the table 
                                                         $(selector).append(row); 
                                                }
////                                              
                                             
        
                                        function Headers(response, selector) { 
                                                    var columns = []; 
                                                    var header = $('<tr/>'); 
              
                                                    for (var i = 0; i < response.length; i++) { 
                                                                        var row = response[i]; 
                  
                                                        for (var k in row) { 
                                                        if ($.inArray(k, columns) == -1) { 
                                                                columns.push(k); 
                          
                                                                    // Creating the header 
                                                             header.append($('<th/>').html(k)); 
                                                            } 
                                                        } 
                                                     } 
              
                                                        // Appending the header to the table 
                                                    $(selector).append(header); 
                                                    return columns; 
                                                    }        
                            }
                        
                       });
                 }  
    
   
    
    
</script>
</body>
</html>