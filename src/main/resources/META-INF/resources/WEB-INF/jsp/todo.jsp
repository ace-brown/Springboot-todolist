<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html lang="en">
  <head>
    <link href="webjars/bootstrap/5.3.1/css/bootstrap.min.css" rel="stylesheet">
    <title>Todos List</title>
  </head>
  <body>
     <div class="container">
      		<h1>Add your Todo</h1>
      		<form method="post">
      			<label for="description">Description:</label>
      			<input id="description" type="text" name="description" required="required">
      			<button type="submit" class="btn btn-success">Add New Todo</button>
      		</form>
     </div>
    <script src="webjars/bootstrap/5.3.1/js/bootstrap.min.js"></script>
    <script src="resources/webjars/jquery/3.7.1/jquery.min.js"></script>
  </body>
</html>
