<%@page import="entities.Session_Info"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<% session = pageContext.getSession(); %>

<!DOCTYPE HTML>
<html>
	<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>FREELANCER HOME</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="description" content="" />
	<meta name="keywords" content="" />
	<meta name="author" content="" />

	<meta property="og:title" content=""/>
	<meta property="og:image" content=""/>
	<meta property="og:url" content=""/>
	<meta property="og:site_name" content=""/>
	<meta property="og:description" content=""/>
	<meta name="twitter:title" content="" />
	<meta name="twitter:image" content="" />
	<meta name="twitter:url" content="" />
	<meta name="twitter:card" content="" />

	<link href="https://fonts.googleapis.com/css?family=Open+Sans:400,700,800" rel="stylesheet">
	<link href="https://fonts.googleapis.com/css?family=Playfair+Display:400,700" rel="stylesheet">
	
	<link rel="icon" type="image/png" href="offre/images/icons/favicon.ico"/>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="offre/vendor1/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="offre/fonts1/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="offre/vendor1/animate/animate.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="offre/vendor1/select2/select2.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="offre/vendor1/perfect-scrollbar/perfect-scrollbar.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="offre/css1/util.css">
	<link rel="stylesheet" type="text/css" href="offre/css1/main.css">
	
	
	
	
	<!-- Animate.css -->
	<link rel="stylesheet" href="css/animate.css">
	<!-- Icomoon Icon Fonts-->
	<link rel="stylesheet" href="css/icomoon.css">
	<!-- Bootstrap  -->
	<link rel="stylesheet" href="css/bootstrap.css">

	<!-- Magnific Popup -->
	<link rel="stylesheet" href="css/magnific-popup.css">

	<!-- Flexslider  -->
	<link rel="stylesheet" href="css/flexslider.css">

	<!-- Owl Carousel -->
	<link rel="stylesheet" href="css/owl.carousel.min.css">
	<link rel="stylesheet" href="css/owl.theme.default.min.css">
	
	<!-- Flaticons  -->
	<link rel="stylesheet" href="fonts/flaticon/font/flaticon.css">

	<!-- Theme style  -->
	<link rel="stylesheet" href="css/style.css">
		<link rel="stylesheet" href="css/style1.css">
		<script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>

    <script src="js/index1.js"></script>
	
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
		
	<div class="colorlib-loader" ></div>

	<div id="page">
		<nav class="colorlib-nav" role="navigation">
			
			<div class="top-menu">
				<div class="container">
					<div class="row">
						<div class="col-md-2">
							<div id="colorlib-logo"><a href="accueil.jsp">PROJETS3</a></div>
						</div>
						<div class="col-md-10 text-right menu-1">
								<ul>
								<li class="has-dropdown">
									<a class="btn-cta"><span>${sessionScope.user_session.prenom} ${sessionScope.user_session.nom} </span></a>
									<ul class="dropdown">
										<li><a href="FreelancerHome.jsp">Accueil</a></li>
										<li><a href="offres.php">Derni�res offres</a></li>
										<li><a href="PostulationsFreelancer.php?id=${sessionScope.user_session.id}">Mes postulations</a></li>
										<li><a href="index.jsp">Mes projets</a></li>
										<li><a href="Profil.jsp">Mon profil</a></li>
										<li><a href="disconnect">SE DECONNECTER</a></li>
									</ul>
								</li>	
								</ul>
							
						</div>
					</div>
				</div>
			</div>
		</nav>
		<aside id="colorlib-hero">
			<div class="flexslider">
				<ul class="slides">
			   	<li style="background-image: url(images/img_bg_1.jpg);">
			   		<div class="overlay"></div>
			   		<div class="container-fluid">
			   			<div class="row">
				   			<div class="col-md-6 col-sm-12 col-md-offset-3 slider-text">
				   				<div class="slider-text-inner text-center">
				   					<h1>Derni�res oooffres</h1>
				   				</div>
				   			</div>
				   		</div>
			   		</div>
			   	</li>
			  	</ul>
		  	</div>
		</aside>
	
		
		<div class="colorlib-event">
			<div class="container">
			 <c:forEach items="${model.offres}" var="p">
				
				
					<div >
						<div class="event-entry">
							<div class="desc">
								<h2><a href="event.html">${p.projet}</a></h2>
								<p class="meta"><span >Dur�e</span><span >${p.dure}</span></p>
								<h5><span>Cat�gorie:</span> <span>${p.categorie}</span></h5>
								<p class="organizer"><span>Budget:</span> <span>${p.budget}</span></p>
								
							</div>
							<div class="location">
								<span class="icon"><i class="icon-map"></i></span>
								<td class='select1'><a class='button1' href="postulation?id=${p.id}">Postuler</a></td>
							</div>
						</div>
					</div>
				
			</c:forEach>
			</div>
		</div>
	
		<div class="container">
  <div class="row" >
    <div class="col-xs-12">
      <div class="table-responsive" data-pattern="priority-columns">
        
      </div><!--end of .table-responsive-->
    </div>
  </div>
</div>
<footer id="colorlib-footer">
			<div class="container">
				<div class="row row-pb-md">
					<div class="col-md-3 colorlib-widget">
						<h4>About Eskwela</h4>
						<p>Far from the countries Vokalia and Consonantia, there live the blind texts. Separated they live in Bookmarksgrove right at the coast of the Semantics</p>
						<p>
							<ul class="colorlib-social-icons">
								<li><a href="#"><i class="icon-twitter"></i></a></li>
								<li><a href="#"><i class="icon-facebook"></i></a></li>
								<li><a href="#"><i class="icon-linkedin"></i></a></li>
								<li><a href="#"><i class="icon-dribbble"></i></a></li>
							</ul>
						</p>
					</div>
					

					<div class="col-md-3 colorlib-widget">
						<h4>CATEGORIES</h4>
						<p>
							<ul class="colorlib-footer-links">
								<li><i class="icon-check"></i>Infographie</a></li>
								<li><i class="icon-check"></i> R�daction& traduction</a></li>
								<li><i class="icon-check"></i> D�veloppement web</a></li>
								<li><i class="icon-check"></i> D�veloppement mobile</a></li>
								<li><i class="icon-check"></i> Photo & Audio/vid�o</a></li>
								<li><i class="icon-check"></i> IT & R�seaux</a></li>
							</ul>
						</p>
						
					</div>

					<div class="col-md-3 colorlib-widget">
						<h4>Contact Info</h4>
						<ul class="colorlib-footer-links">
							<li>291 South 21th Street, <br> Suite 721 New York NY 10016</li>
							<li><a href="tel://1234567920"><i class="icon-phone"></i> + 1235 2355 98</a></li>
							<li><a href="mailto:info@yoursite.com"><i class="icon-envelope"></i> info@yoursite.com</a></li>
							<li><a href="http://luxehotel.com"><i class="icon-location4"></i> yourwebsite.com</a></li>
						</ul>
					</div>
				</div>
			</div>
			
		</footer>

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


