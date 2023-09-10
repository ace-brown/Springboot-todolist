<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html lang="en">
  <head>
    <link href="webjars/bootstrap/5.3.1/css/bootstrap.min.css" rel="stylesheet">
    <title>Todos List</title>
  </head>
  <body>
    <div class="container">
      <h1>Your Todos</h1>
      <table class="table">
      	<thead>
      		<tr>
      			<th>Id</th>
      			<th>Description</th>
      			<th>Due Date</th>
      			<th>Finished</th>
      		</tr>
      	</thead>
      	<tbody>
      		<c:forEach items="${todos}" var="todo">
      			<tr>
      				<td>${todo.id}</td>
      				<td>${todo.description}</td>
      				<td>${todo.dueDate}</td>
      				<td>${todo.finished}</td>
      			</tr>
      		</c:forEach>
      	</tbody>
      </table>
      <div class="container">
      		<a class="btn btn-success" href="add-todo">Add New</a>
      </div>
    </div>
    
    <script src="webjars/bootstrap/5.3.1/js/bootstrap.min.js"></script>
    <script src="resources/webjars/jquery/3.7.1/jquery.min.js"></script>
  </body>
</html>
