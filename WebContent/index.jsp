<%@page import="com.a360rn.entity.Staff"%>
<%@ page import="com.a360rn.*, java.util.*"%>

<!DOCTYPE html>

<html>

<head>
<title>Lab01 Patrones De Construcción de Sistemas</title>
<meta charset="UTF-8">
<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	rel="stylesheet">
</head>

<%
	List<Staff> list = (List<Staff>) request.getAttribute("STAFF_LIST");
%>

<body>
	<div class="container">
		<div class="row">
			<div class="col-lg-offset-3 col-lg-6">

				<h1>Staff Table from Sakila Database</h1>

				<table class="table">
					<thead>
						<tr>
							<th>Staff Id</th>
							<th>First Name</th>
							<th>Last Name</th>
						</tr>
					</thead>

					<tbody>
						<%
							for (Staff x : list) {
						%>
						<tr>
							<td><%=x.getStaffId()%></td>
							<td><%=x.getFirstName()%></td>
							<td><%=x.getLastName()%></td>
						</tr>
						<%
							}
						%>
					</tbody>
				</table>
			</div>
		</div>
	</div>

</body>
</html>

