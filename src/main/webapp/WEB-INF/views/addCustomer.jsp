<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Products</title>
</head>

<body>
	<section>
		<div class="jumbotron">
			<div class="container">
				<h1>Customer</h1>
				<p>Add Customer</p>
			</div>
		</div>
	</section>
	<section class="container">
		<form:form method="POST" action="/customers/add" modelAttribute="newCustomer">
             <table>
                <tr>
                    <td><form:label path="name">Name</form:label></td>
                    <td><form:input path="name"/></td>
                </tr>
                <tr>
                    <td><form:label path="address">Address</form:label></td>
                    <td><form:input path="address"/></td>
                </tr>
               
                <tr>
                    <td><input type="submit" value="Submit"/></td>
                </tr>
            </table>
        </form:form>
	</section>
</body>
</html>