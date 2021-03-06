<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="org.jasig.cas.client.authentication.AttributePrincipalImpl"%>
<%@ page import="org.jasig.cas.client.authentication.AttributePrincipal"%>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %> 
<!DOCTYPE html>
<html>
<head>
	<%@ include file="/frames/head.jsp" %>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<!-- Bootstrap 3.3.2 JS -->
    <script src="bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
    <!--<script src="bootstrap/js/jquery.min.js" type="text/javascript"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>-->
	<!-- Bootstrap CSS -->
	<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
	
	<!-- jvectormap -->
    <script src="plugins/jvectormap/jquery-jvectormap-1.2.2.min.js" type="text/javascript"></script>
    <script src="plugins/jvectormap/jquery-jvectormap-world-mill-en.js" type="text/javascript"></script>
</head>
<body class="skin-blue sidebar-mini sidebar-collapse">

<% AttributePrincipal user = (AttributePrincipal) request.getUserPrincipal();%>
<% Map attributes = user.getAttributes(); 
if (user != null) { %>
<script>
<%if (attributes.get("role_id").toString().equals("0") || attributes.get("role_id").toString().equals("1") || attributes.get("role_id").toString().equals("2") || attributes.get("role_id").toString().equals("3")){%>
 	$(document).ready(function(){
 		var entidadCas = "";
		entidadCas ="<%=attributes.get("entidad") %>";
		usuarioRolCas="<%=attributes.get("role_id") %>";
		var usuarios = $.ajax({
			url:'/tablero/ajaxSelects?action=getUsuarios&usuario=<%=user.getName()%>',
		  	type:'get',
		  	dataType:'json',
		  	async:false       
		}).responseText;
		usuarios = JSON.parse(usuarios);
		usuarios = usuarios.usuarios;
		
		$("#nombreUsuario").append(usuarios[0].correo+" ("+usuarios[0].nivel_id+", "+usuarios[0].entidad_id+")");
		$("#PerfilUsuario").append(usuarios[0].nombre+" ("+usuarios[0].nivel_id+", "+usuarios[0].entidad_id+", "+entidadCas+")");
	});
<%}else{%>
	window.location = "http://spr.stp.gov.py/documentacion.jsp";
<%}%>
</script>
	<div class="wrapper">

		<header class="main-header">
			<%@ include file="/frames/mainheader.jsp"%>
		</header>
		<!-- Left side column. contains the logo and sidebar -->
	      <aside class="main-sidebar">
	  			 <%@ include file="/frames/main-sidebar.jsp" %>
	      </aside>

		<!-- Content Wrapper. Contains page content -->
		<div class="content-wrapper">
			 <section class="content-header">
	          <h1>
	            <small>
	            <!--  Titulo, donde antes estaba dashboard -->
	            </small>
	          </h1>
	        </section>
			<!-- Main content -->
			<section class="content" id="programacion">
				<!-- Contenedor de constancias para el PA1 -->
				<div class="box box-primary">
					<div class="box-header with-border" data-toggle="collapse" data-target="#demo1"><!-- Cabecera del box con titulo y botones para expandir -->
						<h3 class="box-title ">Descargar Constancias POI</h3>
						<div class="box-tools pull-right">
							
						</div>
					</div><!-- /.fin-box-header -->
					<div id="demo1" class="box-body collapse in" aria-expanded="true" style="">
						<div class="list-group">
						<div class="list-group" >
							<a href="http://spr.stp.gov.py/tablero/descargas/Constancia_POI_20160615.pdf" download="Constancia_POI_20160615" class="list-group-item glyphicon glyphicon-download-alt"> 15-JUNIO-2016</a>
						</div>
					</div>
				</div>
			</section>
		</div><!-- fin content-wrapper -->
	
	
		<footer class="main-footer">
	        <div class="pull-right hidden-xs">
	          <b>Version</b> 2.0
	        </div>
	        <strong>Copyright &copy; 2015 <a href="http://www.stp.gov.py">STP</a>.</strong> All rights reserved.
      	</footer>
      	      <!-- Control Sidebar -->
      <aside class="control-sidebar control-sidebar-light">
		<!-- include file="/frames/control-sidebar.jsp"  -->
      </aside><!-- /.control-sidebar -->
      <!-- Add the sidebar's background. This div must be placed
           immediately after the control sidebar -->
      <div class='control-sidebar-bg'></div>

   
    </div><!-- fin wrapper -->

    <!-- Librerias para la rutina de cambio de contraseña -->
    <script src="dist/js/jquerymd5.js" type="text/javascript"></script>    	
    <%@ include file="/frames/pass.jsp" %>
    <!-- AdminLTE for demo purposes -->
    <script src="dist/js/demo.js" type="text/javascript"></script>
        <%  } else { %>
			<p>Favor Iniciar Sesion</p>
			<% } %> 

	<!-- Piwik -->
	<script type="text/javascript">
	  var _paq = _paq || [];
	  _paq.push(['trackPageView']);
	  _paq.push(['enableLinkTracking']);
	  (function() {
	    var u="//infra.stp.gov.py/monitoreoweb/";
	    _paq.push(['setTrackerUrl', u+'piwik.php']);
	    _paq.push(['setSiteId', 9]);
	    var d=document, g=d.createElement('script'), s=d.getElementsByTagName('script')[0];
	    g.type='text/javascript'; g.async=true; g.defer=true; g.src=u+'piwik.js'; s.parentNode.insertBefore(g,s);
	  })();
	</script>
<noscript><p><img src="//infra.stp.gov.py/monitoreoweb/piwik.php?idsite=9" style="border:0;" alt="" /></p></noscript>
<!-- End Piwik Code -->
<script type="text/javascript" src="bootstrap/js/bootstrap-slider.js"></script>
 
	<script>
		var entidadCasSpr = "";
		entidadCasSpr ="<%=attributes.get("entidad") %>";
		usuarioRolCasSpr="<%=attributes.get("role_id") %>";
		var usuariosSpr = $.ajax({
			url:'/ajaxSelects?action=getUsuarios&usuario=<%=user.getName()%>',
		  	type:'get',
		  	dataType:'json',
		  	async:false       
		}).responseText;
		usuariosSpr = JSON.parse(usuariosSpr);
		usuariosSpr = usuariosSpr.usuarios;
	</script>
</body>
</html>
