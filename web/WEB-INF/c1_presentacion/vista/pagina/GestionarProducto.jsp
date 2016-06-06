<%-- 
    Document   : GestionarProducto
    Created on : 05/06/2016, 12:30:05 PM
    Author     : Carlos Alfredo Osorio Perez <hacybeyker@hotmail.com>
--%>

<%@page import="c3_dominio.entidad.Imagen"%>
<%@page import="c3_dominio.entidad.Producto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta name="robots" content="all,follow">
    <meta name="googlebot" content="index,follow,snippet,archive">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="Obaju e-commerce template">
    <meta name="author" content="Ondrej Svestka | ondrejsvestka.cz">
    <meta name="keywords" content="">

    <title>
        Obaju : e-commerce template
    </title>

    <meta name="keywords" content="">

    <link href='http://fonts.googleapis.com/css?family=Roboto:400,500,700,300,100' rel='stylesheet' type='text/css'>

    <%@include file="../../../jspfpagina/1_estilos.jspf" %>



</head>
<%
    List<Producto> productos = (List<Producto>)request.getAttribute("productos");
%>
<body>
    <!-- *** TOPBAR ***
 _________________________________________________________ -->
    <div id="top">
        <div class="container">
            <div class="col-md-6 offer" data-animate="fadeInDown">
                <a href="#" class="btn btn-success btn-sm" data-animate-hover="shake">Offer of the day</a>  <a href="#">Get flat 35% off on orders over $50!</a>
            </div>
            <div class="col-md-6" data-animate="fadeInDown">
                <ul class="menu">
                    <li><a href="#" data-toggle="modal" data-target="#login-modal">Login</a>
                    </li>
                    <li><a href="register.html">Register</a>
                    </li>
                    <li><a href="contact.html">Contact</a>
                    </li>
                    <li><a href="#">Recently viewed</a>
                    </li>
                </ul>
            </div>
        </div>
        <div class="modal fade" id="login-modal" tabindex="-1" role="dialog" aria-labelledby="Login" aria-hidden="true">
            <div class="modal-dialog modal-sm">

                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        <h4 class="modal-title" id="Login">Customer login</h4>
                    </div>
                    <div class="modal-body">
                        <form action="customer-orders.html" method="post">
                            <div class="form-group">
                                <input type="text" class="form-control" id="email-modal" placeholder="email">
                            </div>
                            <div class="form-group">
                                <input type="password" class="form-control" id="password-modal" placeholder="password">
                            </div>

                            <p class="text-center">
                                <button class="btn btn-primary"><i class="fa fa-sign-in"></i> Log in</button>
                            </p>

                        </form>

                        <p class="text-center text-muted">Not registered yet?</p>
                        <p class="text-center text-muted"><a href="register.html"><strong>Register now</strong></a>! It is easy and done in 1&nbsp;minute and gives you access to special discounts and much more!</p>

                    </div>
                </div>
            </div>
        </div>

    </div>

    <!-- *** TOP BAR END *** -->

    <!-- *** NAVBAR ***
 _________________________________________________________ -->

    <div class="navbar navbar-default yamm" role="navigation" id="navbar">
        <div class="container">
            <div class="navbar-header">

                <a class="navbar-brand home" href="index.html" data-animate-hover="bounce">
                    <img src="librerias/img/logo.png" alt="Obaju logo" class="hidden-xs">
                    <img src="librerias/img/logo-small.png" alt="Obaju logo" class="visible-xs"><span class="sr-only">Obaju - go to homepage</span>
                </a>
                <div class="navbar-buttons">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navigation">
                        <span class="sr-only">Toggle navigation</span>
                        <i class="fa fa-align-justify"></i>
                    </button>
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#search">
                        <span class="sr-only">Toggle search</span>
                        <i class="fa fa-search"></i>
                    </button>
                    <a class="btn btn-default navbar-toggle" href="basket.html">
                        <i class="fa fa-shopping-cart"></i>  <span class="hidden-xs">3 items in cart</span>
                    </a>
                </div>
            </div>
            <!--/.navbar-header -->

            <div class="navbar-collapse collapse" id="navigation">

                <ul class="nav navbar-nav navbar-left">
                    <%@include file="../../../jspfpagina/2_menu.jspf" %>
                </ul>

            </div>
            <!--/.nav-collapse -->

            <div class="navbar-buttons">

                <div class="navbar-collapse collapse right" id="basket-overview">
                    <a href="basket.html" class="btn btn-primary navbar-btn"><i class="fa fa-shopping-cart"></i><span class="hidden-sm">3 items in cart</span></a>
                </div>
                <!--/.nav-collapse -->

                <div class="navbar-collapse collapse right" id="search-not-mobile">
                    <button type="button" class="btn navbar-btn btn-primary" data-toggle="collapse" data-target="#search">
                        <span class="sr-only">Toggle search</span>
                        <i class="fa fa-search"></i>
                    </button>
                </div>

            </div>

            <div class="collapse clearfix" id="search">

                <form class="navbar-form" role="search">
                    <div class="input-group">
                        <input type="text" class="form-control" placeholder="Search">
                        <span class="input-group-btn">

			<button type="submit" class="btn btn-primary"><i class="fa fa-search"></i></button>

		    </span>
                    </div>
                </form>

            </div>
            <!--/.nav-collapse -->

        </div>
        <!-- /.container -->
    </div>
    <!-- /#navbar -->

    <!-- *** NAVBAR END *** -->

    <div id="all">

        <div id="content">
            <div class="container">

                <div class="col-md-12">
                    <ul class="breadcrumb">
                        <li><a href="#">Home</a>
                        </li>
                        <li>Ladies</li>
                    </ul>
                </div>

                <div class="col-md-3">
                    <!-- *** MENUS AND FILTERS ***
 _________________________________________________________ -->
                    <div class="panel panel-default sidebar-menu">

                        <div class="panel-heading">
                            <h3 class="panel-title">Categories</h3>
                        </div>

                <%
                    //lo que esta comentado no va ya que en el menu ya existe gestionarcategoriaservicio, solo tengo que obtener la categorias
                    //GestionarCategoriaServicio gestionarCategoriaServicio = new GestionarCategoriaServicio();
                    //List<Categoria> categorias = gestionarCategoriaServicio.buscar();
                    for(Categoria categoria : categorias){
                        if(categoria.isActivo()){
                %>
                        <div class="panel-body">
                            <ul class="nav nav-pills nav-stacked category-menu">
                                <li>
                                    <a href="category.html"><%= categoria.getNombre() %> <span class="badge pull-right"><%= categoria.obtenerCantidadLineaSubCategoria() %></span></a>    
                <%
                            for(SubCategoria subCategoria : categoria.getSubCategorias()){
                                if(subCategoria.isActivo()){
                                    for(LineaSubCategoria lineaSubCategoria : subCategoria.getLineaSubCategorias()){
                %>
                                    <ul>
                                        <li><a href="GestionarProducto?codigo=<%= lineaSubCategoria.getCodigo() %>"><%= lineaSubCategoria.getNombre() %></a></li>
                                    </ul>
                <%
                                    }
                                }
                            }
                %>
                                </li>
                            </ul>
                        </div>
                <%
                        }
                    }
                %>
                    </div>
                    
                    <!-- *** MENUS AND FILTERS END *** -->

                    <div class="banner">
                        <a href="#">
                            <img src="librerias/img/banner.jpg" alt="sales 2014" class="img-responsive">
                        </a>
                    </div>
                </div>

                <div class="col-md-9">
                    <div class="box">
                        <h1>Ladies</h1>
                        <p>In our Ladies department we offer wide selection of the best products we have found and carefully selected worldwide.</p>
                    </div>

                    <div class="box info-bar">
                        <div class="row">
                            <div class="col-sm-12 col-md-4 products-showing">
                                Showing <strong>12</strong> of <strong>25</strong> products
                            </div>

                            <div class="col-sm-12 col-md-8  products-number-sort">
                                <div class="row">
                                    <form class="form-inline">
                                        <div class="col-md-6 col-sm-6">
                                            <div class="products-number">
                                                <strong>Show</strong>  <a href="#" class="btn btn-default btn-sm btn-primary">12</a>  <a href="#" class="btn btn-default btn-sm">24</a>  <a href="#" class="btn btn-default btn-sm">All</a> products
                                            </div>
                                        </div>
                                        <div class="col-md-6 col-sm-6">
                                            <div class="products-sort-by">
                                                <strong>Sort by</strong>
                                                <select name="sort-by" class="form-control">
                                                    <option>Price</option>
                                                    <option>Name</option>
                                                    <option>Sales first</option>
                                                </select>
                                            </div>
                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="row products">
<%                    
                    for(Producto producto : productos){
                        if(producto.isActivo()){
                            if(producto.isNuevo() && producto.isOferta()){
                                for(Imagen imagen : producto.getImagenes()){
                                    if(imagen.isPrincipal()){
    %>
                                    <div class="col-md-4 col-sm-6">
                                        <div class="product">
                                            <div class="flip-container">
                                                <div class="flipper">
                                                    <div class="front">
                                                        <a href="DetalleProducto?codigo=<%= producto.getCodigo() %>">
                                                            <img src="<%= imagen.getImagen()%>" alt="" class="img-responsive">
                                                        </a>
                                                    </div>
                                                    <div class="back">
                                                        <a href="DetalleProducto?codigo=<%= producto.getCodigo() %>">
                                                            <img src="<%= imagen.getImagen() %>" alt="" class="img-responsive">
                                                        </a>
                                                    </div>
                                                </div>
                                            </div>
                                            <a href="DetalleProducto?codigo=<%= producto.getCodigo() %>" class="invisible">
                                                <img src="<%= imagen.getImagen() %>" alt="" class="img-responsive">
                                            </a>
                                            <div class="text">
                                                <h3><a href="DetalleProducto?codigo=<%= producto.getCodigo() %>"><%= producto.getNombre() %></a></h3>
                                                <p class="price"><del>S/.<%= String.format("%.2f", producto.getPrecio())%> </del> S/.<%= String.format("%.2f",producto.calcularNuevoPrecio()) %></p>
                                                <p class="buttons">
                                                    <a href="DetalleProducto?codigo=<%= producto.getCodigo() %>" class="btn btn-default">View detail</a>
                                                    <a href="basket.html" class="btn btn-primary"><i class="fa fa-shopping-cart"></i>Add to cart</a>
                                                </p>
                                            </div>
                                            
                                            <div class="ribbon new">
                                                <div class="theribbon">NEW</div>
                                                <div class="ribbon-background"></div>
                                            </div>
                                                    
                                            <div class="ribbon sale">
                                                <div class="theribbon"> <b>-</b><%= producto.getPorcentajeoferta() %>%</div>
                                                <div class="ribbon-background"></div>
                                            </div>
                                            <!-- /.text -->
                                        </div>
                                        <!-- /.product -->
                                    </div>
    <%                      
                                    }
                                }
                            }else{
                                if(producto.isNuevo()){
                                    for(Imagen imagen : producto.getImagenes()){
                                        if(imagen.isPrincipal()){
%>
                                        <div class="col-md-4 col-sm-6">
                                            <div class="product">
                                                <div class="flip-container">
                                                    <div class="flipper">
                                                        <div class="front">
                                                            <a href="DetalleProducto?codigo=<%= producto.getCodigo() %>">
                                                                <img src="<%= imagen.getImagen()%>" alt="" class="img-responsive">
                                                            </a>
                                                        </div>
                                                        <div class="back">
                                                            <a href="DetalleProducto?codigo=<%= producto.getCodigo() %>">
                                                                <img src="<%= imagen.getImagen() %>" alt="" class="img-responsive">
                                                            </a>
                                                        </div>
                                                    </div>
                                                </div>
                                                <a href="DetalleProducto?codigo=<%= producto.getCodigo() %>" class="invisible">
                                                    <img src="<%= imagen.getImagen() %>" alt="" class="img-responsive">
                                                </a>
                                                <div class="text">
                                                    <h3><a href="DetalleProducto?codigo=<%= producto.getCodigo() %>"><%= producto.getNombre() %></a></h3>
                                                    <p class="price">S/.<%= String.format("%.2f",producto.getPrecio()) %></p>
                                                    <p class="buttons">
                                                        <a href="DetalleProducto?codigo=<%= producto.getCodigo() %>" class="btn btn-default">View detail</a>
                                                        <a href="basket.html" class="btn btn-primary"><i class="fa fa-shopping-cart"></i>Add to cart</a>
                                                    </p>
                                                </div>
                                                        
                                                <div class="ribbon new">
                                                    <div class="theribbon">NEW</div>
                                                    <div class="ribbon-background"></div>
                                                </div>
                                                <!-- /.text -->
                                            </div>
                                            <!-- /.product -->
                                        </div>
<%
                                        }
                                    }
                                }else{
                                    if(producto.isOferta()){
                                        for(Imagen imagen : producto.getImagenes()){
                                            if(imagen.isPrincipal()){
%>
                                        <div class="col-md-4 col-sm-6">
                                            <div class="product">
                                                <div class="flip-container">
                                                    <div class="flipper">
                                                        <div class="front">
                                                            <a href="DetalleProducto?codigo=<%= producto.getCodigo() %>">
                                                                <img src="<%= imagen.getImagen()%>" alt="" class="img-responsive">
                                                            </a>
                                                        </div>
                                                        <div class="back">
                                                            <a href="DetalleProducto?codigo=<%= producto.getCodigo() %>">
                                                                <img src="<%= imagen.getImagen() %>" alt="" class="img-responsive">
                                                            </a>
                                                        </div>
                                                    </div>
                                                </div>
                                                <a href="DetalleProducto?codigo=<%= producto.getCodigo() %>" class="invisible">
                                                    <img src="<%= imagen.getImagen() %>" alt="" class="img-responsive">
                                                </a>
                                                <div class="text">
                                                    <h3><a href="DetalleProducto?codigo=<%= producto.getCodigo() %>"><%= producto.getNombre() %></a></h3>
                                                    <p class="price"><del>S/.<%= String.format("%.2f", producto.getPrecio())%> </del> S/.<%= String.format("%.2f",producto.calcularNuevoPrecio()) %></p>
                                                    <p class="buttons">
                                                        <a href="DetalleProducto?codigo=<%= producto.getCodigo() %>" class="btn btn-default">View detail</a>
                                                        <a href="basket.html" class="btn btn-primary"><i class="fa fa-shopping-cart"></i>Add to cart</a>
                                                    </p>
                                                </div>
                                                        
                                                <div class="ribbon sale">
                                                    <div class="theribbon"> <b>-</b><%= producto.getPorcentajeoferta() %>%</div>
                                                    <div class="ribbon-background"></div>
                                                </div>
                                                <!-- /.text -->
                                            </div>
                                            <!-- /.product -->
                                            
                                        </div>                                        
<%
                                            }
                                        }            
                                    }else{
                                        for(Imagen imagen : producto.getImagenes()){
                                            if(imagen.isPrincipal()){
%>
                                            <div class="col-md-4 col-sm-6">
                                                <div class="product">
                                                    <div class="flip-container">
                                                        <div class="flipper">
                                                            <div class="front">
                                                                <a href="DetalleProducto?codigo=<%= producto.getCodigo() %>">
                                                                    <img src="<%= imagen.getImagen()%>" alt="" class="img-responsive">
                                                                </a>
                                                            </div>
                                                            <div class="back">
                                                                <a href="DetalleProducto?codigo=<%= producto.getCodigo() %>">
                                                                    <img src="<%= imagen.getImagen() %>" alt="" class="img-responsive">
                                                                </a>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <a href="DetalleProducto?codigo=<%= producto.getCodigo() %>" class="invisible">
                                                        <img src="<%= imagen.getImagen() %>" alt="" class="img-responsive">
                                                    </a>
                                                    <div class="text">
                                                        <h3><a href="DetalleProducto?codigo=<%= producto.getCodigo() %>"><%= producto.getNombre() %></a></h3>
                                                        <p class="price"><%= producto.getPrecio() %></p>
                                                        <p class="buttons">
                                                            <a href="DetalleProducto?codigo=<%= producto.getCodigo() %>" class="btn btn-default">View detail</a>
                                                            <a href="basket.html" class="btn btn-primary"><i class="fa fa-shopping-cart"></i>Add to cart</a>
                                                        </p>
                                                    </div>
                                                    <!-- /.text -->
                                                </div>
                                                <!-- /.product -->
                                            </div>   
<%
                                            }
                                        }
                                    }
                                }
                            }        
                        }
                    }
%>
                        
                        <!-- /.col-md-4 -->
                    </div>
                    <!-- /.products -->

                    <div class="pages">

                        <p class="loadMore">
                            <a href="#" class="btn btn-primary btn-lg"><i class="fa fa-chevron-down"></i> Load more</a>
                        </p>

                        <ul class="pagination">
                            <li><a href="#">&laquo;</a>
                            </li>
                            <li class="active"><a href="#">1</a>
                            </li>
                            <li><a href="#">2</a>
                            </li>
                            <li><a href="#">3</a>
                            </li>
                            <li><a href="#">4</a>
                            </li>
                            <li><a href="#">5</a>
                            </li>
                            <li><a href="#">&raquo;</a>
                            </li>
                        </ul>
                    </div>


                </div>
                <!-- /.col-md-9 -->
            </div>
            <!-- /.container -->
        </div>
        <!-- /#content -->


        <!-- *** FOOTER ***
 _________________________________________________________ -->
        <div id="footer" data-animate="fadeInUp">
            <div class="container">
                <div class="row">
                    <div class="col-md-3 col-sm-6">
                        <h4>Pages</h4>

                        <ul>
                            <li><a href="text.html">About us</a>
                            </li>
                            <li><a href="text.html">Terms and conditions</a>
                            </li>
                            <li><a href="faq.html">FAQ</a>
                            </li>
                            <li><a href="contact.html">Contact us</a>
                            </li>
                        </ul>

                        <hr>

                        <h4>User section</h4>

                        <ul>
                            <li><a href="#" data-toggle="modal" data-target="#login-modal">Login</a>
                            </li>
                            <li><a href="register.html">Regiter</a>
                            </li>
                        </ul>

                        <hr class="hidden-md hidden-lg hidden-sm">

                    </div>
                    <!-- /.col-md-3 -->

                    <div class="col-md-3 col-sm-6">

                        <h4>Top categories</h4>

                        <h5>Men</h5>

                        <ul>
                            <li><a href="category.html">T-shirts</a>
                            </li>
                            <li><a href="category.html">Shirts</a>
                            </li>
                            <li><a href="category.html">Accessories</a>
                            </li>
                        </ul>

                        <h5>Ladies</h5>
                        <ul>
                            <li><a href="category.html">T-shirts</a>
                            </li>
                            <li><a href="category.html">Skirts</a>
                            </li>
                            <li><a href="category.html">Pants</a>
                            </li>
                            <li><a href="category.html">Accessories</a>
                            </li>
                        </ul>

                        <hr class="hidden-md hidden-lg">

                    </div>
                    <!-- /.col-md-3 -->

                    <div class="col-md-3 col-sm-6">

                        <h4>Where to find us</h4>

                        <p><strong>Obaju Ltd.</strong>
                            <br>13/25 New Avenue
                            <br>New Heaven
                            <br>45Y 73J
                            <br>England
                            <br>
                            <strong>Great Britain</strong>
                        </p>

                        <a href="contact.html">Go to contact page</a>

                        <hr class="hidden-md hidden-lg">

                    </div>
                    <!-- /.col-md-3 -->



                    <div class="col-md-3 col-sm-6">

                        <h4>Get the news</h4>

                        <p class="text-muted">Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas.</p>

                        <form>
                            <div class="input-group">

                                <input type="text" class="form-control">

                                <span class="input-group-btn">

			    <button class="btn btn-default" type="button">Subscribe!</button>

			</span>

                            </div>
                            <!-- /input-group -->
                        </form>

                        <hr>

                        <h4>Stay in touch</h4>

                        <p class="social">
                            <a href="#" class="facebook external" data-animate-hover="shake"><i class="fa fa-facebook"></i></a>
                            <a href="#" class="twitter external" data-animate-hover="shake"><i class="fa fa-twitter"></i></a>
                            <a href="#" class="instagram external" data-animate-hover="shake"><i class="fa fa-instagram"></i></a>
                            <a href="#" class="gplus external" data-animate-hover="shake"><i class="fa fa-google-plus"></i></a>
                            <a href="#" class="email external" data-animate-hover="shake"><i class="fa fa-envelope"></i></a>
                        </p>


                    </div>
                    <!-- /.col-md-3 -->

                </div>
                <!-- /.row -->

            </div>
            <!-- /.container -->
        </div>
        <!-- /#footer -->

        <!-- *** FOOTER END *** -->




        <!-- *** COPYRIGHT ***
 _________________________________________________________ -->
        <%@include file="../../../jspfpagina/4_piepagina.jspf" %>
        <!-- *** COPYRIGHT END *** -->



    </div>
    <!-- /#all -->


    

    <!-- *** SCRIPTS TO INCLUDE ***
 _________________________________________________________ -->
    <%@include file="../../../jspfpagina/5_scripts.jspf" %>






</body>

</html>