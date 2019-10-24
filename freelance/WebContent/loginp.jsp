<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE HTML>
<html>
	<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>LOGIN</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="description" content="" />
	<meta name="keywords" content="" />
	<meta name="author" content="" />

	

	<link href="https://fonts.googleapis.com/css?family=Open+Sans:400,700,800" rel="stylesheet">
	<link href="https://fonts.googleapis.com/css?family=Playfair+Display:400,700" rel="stylesheet">
	
	<link rel="stylesheet" href="css/animate.css">
	<link rel="stylesheet" href="css/icomoon.css">
	<link rel="stylesheet" href="css/bootstrap.css">

	<link rel="stylesheet" href="css/magnific-popup.css">

	<link rel="stylesheet" href="css/flexslider.css">
	<link rel="stylesheet" href="css/owl.carousel.min.css">
	<link rel="stylesheet" href="css/owl.theme.default.min.css">
	<link rel="stylesheet" href="fonts/flaticon/font/flaticon.css">

<!-- Theme style  -->
	<link rel="stylesheet" href="css/style.css">
	
    <link href="formulaire/vendor/mdi-font/css/material-design-iconic-font.min.css" rel="stylesheet" media="all">
    <link href="formulaire/vendor/font-awesome-4.7/css/font-awesome.min.css" rel="stylesheet" media="all">
    <!-- Font special for pages-->
    <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i" rel="stylesheet">

    <!-- Vendor CSS-->
    <link href="formulaire/vendor/select2/select2.min.css" rel="stylesheet" media="all">
    <link href="formulaire/vendor/datepicker/daterangepicker.css" rel="stylesheet" media="all">

    <!-- Main CSS-->
    <link href="formulaire/css/main.css" rel="stylesheet" media="all">

	<!-- Modernizr JS -->
	<script src="js/modernizr-2.6.2.min.js"></script>
	<!-- FOR IE9 below -->
	<!--[if lt IE 9]>
	<script src="js/respond.min.js"></script>
	<![endif]-->

	</head>
	<body>
		
	<div class="colorlib-loader"></div>

	<div id="page">
		<nav class="colorlib-nav" role="navigation">
			
			<div class="top-menu">
				<div class="container">
					<div class="row">
						<div class="col-md-2">
							<div id="colorlib-logo"><a href="accueil.jsp">Freelancer</a></div>
						</div>
						<div class="col-md-10 text-right menu-1">
							<ul>
									<li class="has-dropdown">
									<a  class="btn-cta">S'INSCRIRE</a>
									<ul class="dropdown">
										
										<li><a href="index.jsp">Freelancer</a></li>
										<li><a href="indexp.jsp">Porteur de projet</a></li>
										
									</ul>
								</li>
								<li class="has-dropdown">
									<a class="btn-cta"><span>SE CONNECTER</span></a>
									<ul class="dropdown">
										
										<li><a href="login.jsp">Freelancer</a></li>
										<li><a href="loginp.jsp">Porteur de projet</a></li>
									</ul>
								</li>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</nav>
		<div class="main">
<div class="page-wrapper bg-gra-03 p-t-45 p-b-50"  style="background-image: url(images/blog-6.jpg) ;">
        <div class="wrapper wrapper--w790">
            <div class="card card-5">
                <div class="card-heading">
                    <h2 class="title">Connexion</h2>
                </div>
                <div class="card-body">
                    <form action="LogInp" method="POST" >
                        
                        <div class="form-row">
                            <div class="name">Adresse Email</div>
                            <div class="value">
                                <div class="input-group">
                                    <input class="input--style-5" type="text" name="mail" >
                                </div>
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="name">Mot de passe</div>
                            <div class="value">
                                <div class="input-group">
                                    <input class="input--style-5" type="password" name="mdp" >
                                </div>
                            </div>
                        </div>
                        
                        
                        
                        <div>
                           <button class="btn btn--radius-2 btn--red" name="action" type="submit" >Se connecter</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>

    <!-- Jquery JS-->
    <script src="formulaire/vendor/jquery/jquery.min.js"></script>
    <!-- Vendor JS-->
    <script src="formulaire/vendor/select2/select2.min.js"></script>
    <script src="formulaire/vendor/datepicker/moment.min.js"></script>
    <script src="formulaire/vendor/datepicker/daterangepicker.js"></script>

    <!-- Main JS-->
    <script src="js/global.js"></script>

	
	<!-- jQuery -->
	<script src="js/jquery.min.js"></script>
	<!-- jQuery Easing -->
	<script src="js/jquery.easing.1.3.js"></script>
	<!-- Bootstrap -->
	<script src="js/bootstrap.min.js"></script>
	<!-- Waypoints -->
	<script src="js/jquery.waypoints.min.js"></script>
	<!-- Stellar Parallax -->
	<script src="js/jquery.stellar.min.js"></script>
	<!-- Flexslider -->
	<script src="js/jquery.flexslider-min.js"></script>
	<!-- Owl carousel -->
	<script src="js/owl.carousel.min.js"></script>
	<!-- Magnific Popup -->
	<script src="js/jquery.magnific-popup.min.js"></script>
	<script src="js/magnific-popup-options.js"></script>
	<!-- Counters -->
	<script src="js/jquery.countTo.js"></script>
	<!-- Main -->
	<script src="js/main.js"></script>
	

	</body>
</html>


