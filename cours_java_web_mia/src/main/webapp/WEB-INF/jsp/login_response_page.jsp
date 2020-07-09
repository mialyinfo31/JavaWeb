 <!DOCTYPE html>
 <html lang="fr-FR">
     <head>
         <meta charset="utf-8"/>
      </head>
     <body>
      <div>
         <h1> Bonjour <%= request.getParameter("login") %> </h1>
         <h1> Ton accès est <%= request.getParameter("password") %> </h1>
      </div>
     </body>
  </html>

