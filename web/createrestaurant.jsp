<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Restaurant register</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!--Import Google Icon Font-->
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <!--Import materialize.css-->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.99.0/css/materialize.min.css">
    </head>
    <body>
        <div class="container">
            <div class="row">
                    <h1>Java restaurant register</h1>
                <form class="col m12" name="Name Input Form" action="register">
                    <div class="row">
                        <div class="col m12">
                            <div class="input-field">
                                <label for="name">Restaurant name</label>
                                <br>
                                <input id="name" type="text" class="validate" name="name"/>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col m6">
                            <div class="input-field">
                                <label for="address1">Address 1</label>
                                <br>
                                <input id="address1" type="text" class="validate" name="address1">
                            </div>
                        </div>
                       <div class="col m6">
                            <div class="input-field ">
                                <label for="address2">Address2</label>
                                <br>
                                <input id="address2" type="text" class="validate" name="address2">
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col m6">
                            <div class="input-field ">
                                <label for="city">City</label>
                                <br>
                                <input id="city" type="text" class="validate" name="city">
                            </div>
                        </div>
                        <div class="col m6">
                            <div class="input-field ">
                                <label for="category">Category</label>
                                <br>
                                <input id="category" type="text" class="validate" name="category">
                            </div>
                        </div>
                    </div>
                     <div class="row">
                        <div class="col m6">
                            <div class="input-field ">
                                <label for="city">City</label>
                                <br>
                                <input id="city" type="text" class="validate" name="city">
                            </div>
                        </div>
                        <div class="col m6">
                            <div class="input-field ">
                                <label for="category">Category</label>
                                <br>
                                <input id="category" type="text" class="validate" name="category">
                            </div>
                        </div>
                    </div>
                    <input class="waves-effect waves-light btn" type="submit" value="OK" />
                </form>
            </div>
        </div>  
        <script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.99.0/js/materialize.min.js"></script>
        <script>
        $(document).ready(function() {
            Materialize.updateTextFields();
        });
        </script>
    </body>
</html>
