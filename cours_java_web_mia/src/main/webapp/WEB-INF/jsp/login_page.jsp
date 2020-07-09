<!DOCTYPE html>
<html lang="fr-FR">
    <head>
        <meta charset="utf-8"/>
                <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
                <link href="./style.css" rel="stylesheet">
                <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
                <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
     </head>
    <body>
            <div class="wrapper fadeInDown">
              <div id="formContent">

                <!-- Login ATTEINDRE LA SERVLET LOGIN PAR LA METHODE POST-->
                <form action="login" method="POST">
                  <input type="text" id="login" class="fadeIn second" name="login" placeholder="login">
                  <input type="text" id="password" class="fadeIn third" name="password" placeholder="password">
                  <input type="submit" class="fadeIn fourth" value="Log In">
                </form>

                <!-- Remind Passowrd -->
                <div id="formFooter">
                  <a class="underlineHover" href="#">Forgot Password?</a>
                </div>

              </div>
            </div>
   </body>
</html>