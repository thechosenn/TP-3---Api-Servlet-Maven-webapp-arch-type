<html>
    <head>
        <meta charset="UTF-8"/>
        <title> U I :: F O R M </title>
        <link rel="stylesheet" herf="css/monStyle.css">
    </head>
    <body style="font-family: Optima" class="mg20"><br>
    <p class="h4 bold gray"> Formulaire de satisfaction </p> <br>

    <form name="form1" method="get" action="form">
        <p class="bold">
            Nom     :  <input type="text" name="nom">
            Prenom  :  <input type="text" name="prenom">
        </p>
        <p> <span class="bold"> Sexe   :</span>
            <input type="radio" name="radio1" value="mas" checked> masculin
            <input type="radio" name="radio1" value="fem"> feminin
        </p>
        <p> Commentaire  :<br>
            <textarea name="textarea" cols="56" rows="10" class="gray"></textarea>
            <br><br>
            <input class="btn btn-success bold" type="submit" name="Submit" value="Soumettre">
        </p>
    </form>
    </body>
</html>
