<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {
    font-family: "Lato", sans-serif;
}

.sidenav {
    height: 100%;
    width: 200px;
    position: fixed;
    z-index: 1;
    top: 0;
    right: 0;
    background-color: LightBlue;
    overflow-x: hidden;
    padding-top: 20px;
}

.sidenav a {
    padding: 6px 6px 6px 32px;
    text-decoration: none;
    font-size: 15px;
    color: DarkBlue;
    display: block;
}

.sidenav a:hover {
    color: #f1f1f1;
}

.main {
    margin-left: 200px; /* Same as the width of the sidenav */
}

@media screen and (max-height: 450px) {
  .sidenav {padding-top: 15px;}
  .sidenav a {font-size: 18px;}
}
</style>
</head>
<body>

<div class="sidenav">
	<a><b>.: Menu :.</b></a><br>
	<a href="../index.jsp">Home</a>
	<a href="add-book.jsp">Adding a Book</a> 
	<a href="add-book-no-servlet.jsp">Adding a Book No Servlet</a>
	<a href="list-books-jstl.jsp">Listing all Books using JSTL</a> 
	<a href="list-books.jsp">Listing all Books</a> 
	<a href="random-table-taglib.jsp">Random Number Table with Taglib</a>
</div>

</body>
</html> 