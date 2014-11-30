<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<div class="container">
    <h1>Beställ certifikat</h1>

    <div class="panel panel-default">
        <div class="panel-heading">
            <h3 class="panel-title">Registrera elev</h3>
        </div>
        <div class="panel-body">
            <form class="form-horizontal">
                <div class="panel col-md-6">
                    <div class="panel-heading">
                        <h3 class="panel-title">Elev</h3>
                    </div>
                    <fieldset>
                        <div class="form-group">
                            <label class="control-label col-md-4" for="selectbasic">Certifikat</label>

                            <div class="controls col-md-7">
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

                        <div class="form-group">
                            <label class="control-label col-md-4" for="prepayed">Certifikat nummer</label>

                            <div class="controls col-md-5">
                                <input id="prepayed" name="prepayed" type="text" placeholder=""
                                       class="input-xlarge form-control" required="true">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-md-4" for="personnummer">Personnummer</label>

                            <div class="controls col-md-7">
                                <input id="personnummer" name="personnummer" type="text" placeholder="19001203-3912"
                                       class="input-xlarge form-control" required="">
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="control-label col-md-4" for="firstname">Förnamn</label>

                            <div class="controls col-md-7">
                                <input id="firstname" name="firstname" type="text" placeholder="Elevens förnamn"
                                       class="input-xlarge form-control" required="">
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="control-label col-md-4" for="lastname">Efternamn</label>

                            <div class="controls col-md-7">
                                <input id="lastname" name="lastname" type="text" placeholder="Elevens efternamn"
                                       class="input-xlarge form-control" required="">
                            </div>
                        </div>


                        <div class="form-group">
                            <label class="control-label col-md-4" for="address">Adress</label>

                            <div class="controls col-md-7">
                                <input id="address" name="address" type="text" placeholder="Västralånggatan 19"
                                       class="input-xlarge form-control" required="">
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="control-label col-md-4" for="address2">Adress</label>

                            <div class="controls col-md-7">
                                <input id="address2" name="address2" type="text" placeholder="C/O Sven Svensson"
                                       class="input-xlarge form-control" required="">
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="control-label col-md-4" for="postnumber">Postnummer</label>

                            <div class="controls col-md-7">
                                <input id="postnumber" name="postnumber" type="text" placeholder="212 23"
                                       class="input-xlarge form-control">
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="control-label col-md-4" for="city">Stad</label>

                            <div class="controls col-md-7">
                                <input id="city" name="city" type="text" placeholder="Malmö"
                                       class="input-xlarge form-control"
                                       required="">
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="control-label col-md-4" for="email">eMail</label>

                            <div class="controls col-md-7">
                                <input id="email" name="email" type="text" placeholder="eMail"
                                       class="input-xlarge form-control"
                                       required="">
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="control-label col-md-4" for="phonenumber">Telefonnummer</label>

                            <div class="controls col-md-7">
                                <input id="phonenumber" name="phonenumber" type="text" placeholder="0701122334"
                                       class="input-xlarge form-control">
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="control-label col-md-4" for="certimage">Ladda upp bild</label>

                            <div class="controls col-md-7">
                                <input id="certimage" name="certimage" class="input-file form-control" type="file">
                            </div>
                        </div>
                    </fieldset>
                </div>
                <div class="col-md-6 panel">
                    <div class="panel-heading">
                        <h3 class="panel-title">Instruktör</h3>
                    </div>
                    <fieldset>
                        <div class="form-group">
                            <label class="control-label col-md-4" for="instructor">Certifikat nummer</label>

                            <div class="controls col-md-5">
                                <input id="instructor" name="instructor" type="text" placeholder=""
                                       class="input-xlarge form-control" required="true">
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="control-label col-md-4" for="firstname">Förnamn</label>

                            <div class="controls col-md-7">
                                <input id="i_firstname" name="firstname" type="text" placeholder="Instruktörens förnamn"
                                       class="input-xlarge form-control" required="">
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="control-label col-md-4" for="lastname">Efternamn</label>

                            <div class="controls col-md-7">
                                <input id="i_lastname" name="lastname" type="text" placeholder="Instruktörens efternamn"
                                       class="input-xlarge form-control" required="">
                            </div>
                        </div>
                    </fieldset>
                </div>
                <div class="col-md-6 panel">
                    <fieldset>
                        <div class="form-group">
                            <label class="control-label col-md-4" for="button1id"></label>

                            <div class="controls col-md-7">
                                <button id="button1id" name="button1id" class="btn btn-danger">Avbryt</button>
                                <button id="button2id" name="button2id" class="btn btn-success">Registrera</button>
                            </div>
                        </div>
                    </fieldset>
                </div>
            </form>
        </div>
    </div>
</div>