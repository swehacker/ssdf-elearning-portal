<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<div class="container">
    <h1>Beställ certifikat</h1>

    <div class="panel panel-default">
        <div class="panel-heading">
            <h3 class="panel-title">Registrera elev</h3>
        </div>
        <div class="panel-body">
            <form class="form-horizontal">
                <fieldset>
                    <div class="control-group">
                        <label class="control-label col-xs-2" for="selectbasic">Certifikat</label>

                        <div class="controls col-xs-8">
                            <select id="selectbasic" name="selectbasic" class="input-xlarge form-control">
                                <option>CMAS *</option>
                                <option>CMAS **</option>
                                <option>CMAS ***</option>
                                <option>CMAS Nitrox</option>
                                <option>CMAS Gasblandare Nitrox</option>
                                <option>CMAS Gasblandare Trimix</option>
                                <option>CMAS Avancerad Nitrox</option>
                            </select>
                        </div>
                    </div>

                    <div class="control-group">
                        <label class="control-label col-xs-2" for="firstname">Förnamn</label>

                        <div class="controls col-xs-8">
                            <input id="firstname" name="firstname" type="text" placeholder="Elevens förnamn"
                                   class="input-xlarge form-control" required="">
                        </div>
                    </div>

                    <div class="control-group">
                        <label class="control-label col-xs-2" for="lastname">Efternamn</label>

                        <div class="controls col-xs-8">
                            <input id="lastname" name="lastname" type="text" placeholder="Elevens efternamn"
                                   class="input-xlarge form-control" required="">
                        </div>
                    </div>

                    <div class="control-group">
                        <label class="control-label col-xs-2" for="personnummer">Personnummer</label>

                        <div class="controls col-xs-8">
                            <input id="personnummer" name="personnummer" type="text" placeholder="19001203-3912"
                                   class="input-xlarge form-control" required="">
                        </div>
                    </div>

                    <div class="control-group">
                        <label class="control-label col-xs-2" for="address">Adress</label>

                        <div class="controls col-xs-8">
                            <input id="address" name="address" type="text" placeholder="Västralånggatan 19"
                                   class="input-xlarge form-control" required="">
                        </div>
                    </div>

                    <div class="control-group">
                        <label class="control-label col-xs-2" for="address2">Adress</label>

                        <div class="controls col-xs-8">
                            <input id="address2" name="address2" type="text" placeholder="C/O Sven Svensson"
                                   class="input-xlarge form-control" required="">
                        </div>
                    </div>

                    <div class="control-group">
                        <label class="control-label col-xs-2" for="postnumber">Postnummer</label>

                        <div class="controls col-xs-8">
                            <input id="postnumber" name="postnumber" type="text" placeholder="212 23"
                                   class="input-xlarge form-control">
                        </div>
                    </div>

                    <div class="control-group">
                        <label class="control-label col-xs-2" for="city">Stad</label>

                        <div class="controls col-xs-8">
                            <input id="city" name="city" type="text" placeholder="Malmö" class="input-xlarge form-control"
                                   required="">
                        </div>
                    </div>

                    <div class="control-group">
                        <label class="control-label col-xs-2" for="email">eMail</label>

                        <div class="controls col-xs-8">
                            <input id="email" name="email" type="text" placeholder="eMail" class="input-xlarge form-control"
                                   required="">
                        </div>
                    </div>

                    <div class="control-group">
                        <label class="control-label col-xs-2" for="phonenumber">Telefonnummer</label>

                        <div class="controls col-xs-8">
                            <input id="phonenumber" name="phonenumber" type="text" placeholder="0701122334"
                                   class="input-xlarge form-control">
                        </div>
                    </div>

                    <div class="control-group">
                        <label class="control-label col-xs-2" for="certimage">Ladda upp bild</label>

                        <div class="controls col-xs-8">
                            <input id="certimage" name="certimage" class="input-file form-control" type="file">
                        </div>
                    </div>

                    <div class="control-group">
                        <label class="control-label col-xs-2" for="button1id"></label>

                        <div class="controls col-xs-8">
                            <button id="button1id" name="button1id" class="btn btn-danger">Avbryt</button>
                            <button id="button2id" name="button2id" class="btn btn-success">Registrera</button>
                        </div>
                    </div>
                </fieldset>
            </form>
        </div>
    </div>
</div>