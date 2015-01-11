<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<div class="panel panel-default">
  <div class="panel-heading"  id="formandcontrol">form and control (表单及其控件,需要使用bootstrap模板)</div>
  <div class="panel-body">
  	<s:form theme="bootstrap">
  		<s:textfield name="username" label="User Name" help="Please input your name here." placeholder="input name"></s:textfield>
  		<s:password name="password" label="Password"  ></s:password>
  		<s:password name="rePassword" label="retype your password"></s:password>
  		<s:checkbox name="checkbox" label="agree this one." value="1"/>
  		<s:checkboxlist list="#{'g':'how are you','h':'hello' }" name="checkboxlist" ></s:checkboxlist>
  		<s:textarea name="textarea" rows="5" label="Description"></s:textarea>
		<s:select list="{'Chinese','English','French','Japenese'}" name="language" label="Your language"></s:select>
		<s:file label="Your file to upload" name="file" help="upload your favorite photo for your profile." />
		<br />
		<s:radio list="{'one','two','three'}" name="selectone" value="one" label="your age" help="you must select one from those numbers."></s:radio>
		<br />
  		<s:submit value="Register" cssClass="btn-default"></s:submit>
  		<s:submit value="Register" cssClass="btn-primary"></s:submit>
  		<s:reset value="Reset" cssClass="btn-primary"></s:reset>
  	</s:form>
  	<br />
  </div>
</div>
<div class="panel panel-default">
	<div class="panel-heading"  id="inlineform">Inline form example(输入元素在同行的例子)</div>
	<div class="panel-body">
		<s:form theme="bootstrap" cssClass="form-inline">
			<s:radio list="{'title','content'}" name="content" />
			<s:textfield name="key" />
			<s:submit value="search" cssClass="btn-default" />
		</s:form>
	</div>
</div>
<div class="panel panel-default">
 <div class="panel-heading" id="button">buttons(按钮)</div>
 <div class="panel-body">
 	<div class="container">
 		<div class="row">
			<div class="col-md-12">
			  	<a class="btn btn-default btn-lg" href="#">Large Button</a>
			  	<a class="btn btn-default btn-lg active"  href="#" role="button">Large Button</a>
			  	<a class="btn btn-default" href="#">Default Button</a>
			  	<a class="btn btn-default btn-sm" href="#">Small Button</a>
			</div> 	
	 	</div>
	 	<div class="row">
	 		<div class="col-md-12">
	 			<h3>Button with dropdown menu</h3>
				<div class="btn-group">
				  <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown">
				    Action <span class="caret"></span>
				  </button>
				  <ul class="dropdown-menu" role="menu">
				    <li><a href="#">Action</a></li>
				    <li><a href="#">Another action</a></li>
				    <li><a href="#">Something else here</a></li>
				    <li class="divider"></li>
				    <li><a href="#">Separated link</a></li>
				  </ul>
				</div>
	 		</div>
	 	</div>
 	</div>
 </div> <!-- panel body -->
</div> <!-- panel -->

<div class="panel panel-default">
 <div class="panel-heading" id="page">Pagination(分页导航)</div>
 <div class="panel-body">
<ul class="pagination">
  <li><a href="#">&laquo;</a></li>
  <li><a href="#">1</a></li>
  <li><a href="#">2</a></li>
  <li><a href="#">3</a></li>
  <li><a href="#">4</a></li>
  <li><a href="#">5</a></li>
  <li><a href="#">&raquo;</a></li>
</ul>
 </div>
</div>
<div class="panel panel-default">
 <div class="panel-heading" id="icon">Glyphicons (字体图标)</div>
 <div class="panel-body">
<ul class="bs-glyphicons">
      <li>
        <span class="glyphicon glyphicon-adjust"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-adjust</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-align-center"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-align-center</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-align-justify"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-align-justify</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-align-left"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-align-left</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-align-right"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-align-right</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-arrow-down"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-arrow-down</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-arrow-left"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-arrow-left</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-arrow-right"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-arrow-right</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-arrow-up"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-arrow-up</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-asterisk"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-asterisk</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-backward"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-backward</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-ban-circle"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-ban-circle</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-barcode"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-barcode</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-bell"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-bell</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-bold"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-bold</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-book"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-book</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-bookmark"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-bookmark</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-briefcase"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-briefcase</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-bullhorn"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-bullhorn</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-calendar"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-calendar</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-camera"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-camera</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-certificate"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-certificate</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-check"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-check</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-chevron-down"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-chevron-down</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-chevron-left"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-chevron-left</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-chevron-right"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-chevron-right</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-chevron-up"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-chevron-up</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-circle-arrow-down"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-circle-arrow-down</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-circle-arrow-left"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-circle-arrow-left</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-circle-arrow-right"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-circle-arrow-right</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-circle-arrow-up"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-circle-arrow-up</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-cloud"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-cloud</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-cloud-download"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-cloud-download</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-cloud-upload"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-cloud-upload</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-cog"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-cog</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-collapse-down"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-collapse-down</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-collapse-up"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-collapse-up</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-comment"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-comment</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-compressed"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-compressed</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-copyright-mark"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-copyright-mark</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-credit-card"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-credit-card</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-cutlery"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-cutlery</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-dashboard"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-dashboard</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-download"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-download</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-download-alt"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-download-alt</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-earphone"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-earphone</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-edit"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-edit</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-eject"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-eject</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-envelope"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-envelope</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-euro"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-euro</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-exclamation-sign"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-exclamation-sign</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-expand"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-expand</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-export"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-export</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-eye-close"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-eye-close</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-eye-open"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-eye-open</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-facetime-video"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-facetime-video</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-fast-backward"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-fast-backward</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-fast-forward"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-fast-forward</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-file"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-file</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-film"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-film</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-filter"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-filter</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-fire"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-fire</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-flag"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-flag</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-flash"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-flash</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-floppy-disk"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-floppy-disk</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-floppy-open"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-floppy-open</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-floppy-remove"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-floppy-remove</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-floppy-save"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-floppy-save</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-floppy-saved"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-floppy-saved</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-folder-close"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-folder-close</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-folder-open"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-folder-open</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-font"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-font</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-forward"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-forward</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-fullscreen"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-fullscreen</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-gbp"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-gbp</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-gift"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-gift</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-glass"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-glass</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-globe"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-globe</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-hand-down"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-hand-down</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-hand-left"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-hand-left</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-hand-right"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-hand-right</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-hand-up"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-hand-up</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-hd-video"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-hd-video</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-hdd"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-hdd</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-header"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-header</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-headphones"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-headphones</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-heart"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-heart</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-heart-empty"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-heart-empty</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-home"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-home</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-import"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-import</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-inbox"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-inbox</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-indent-left"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-indent-left</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-indent-right"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-indent-right</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-info-sign"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-info-sign</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-italic"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-italic</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-leaf"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-leaf</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-link"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-link</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-list"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-list</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-list-alt"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-list-alt</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-lock"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-lock</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-log-in"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-log-in</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-log-out"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-log-out</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-magnet"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-magnet</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-map-marker"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-map-marker</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-minus"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-minus</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-minus-sign"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-minus-sign</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-move"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-move</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-music"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-music</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-new-window"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-new-window</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-off"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-off</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-ok"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-ok</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-ok-circle"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-ok-circle</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-ok-sign"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-ok-sign</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-open"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-open</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-paperclip"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-paperclip</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-pause"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-pause</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-pencil"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-pencil</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-phone"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-phone</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-phone-alt"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-phone-alt</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-picture"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-picture</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-plane"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-plane</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-play"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-play</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-play-circle"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-play-circle</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-plus"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-plus</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-plus-sign"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-plus-sign</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-print"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-print</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-pushpin"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-pushpin</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-qrcode"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-qrcode</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-question-sign"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-question-sign</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-random"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-random</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-record"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-record</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-refresh"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-refresh</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-registration-mark"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-registration-mark</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-remove"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-remove</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-remove-circle"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-remove-circle</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-remove-sign"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-remove-sign</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-repeat"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-repeat</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-resize-full"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-resize-full</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-resize-horizontal"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-resize-horizontal</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-resize-small"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-resize-small</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-resize-vertical"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-resize-vertical</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-retweet"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-retweet</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-road"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-road</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-save"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-save</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-saved"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-saved</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-screenshot"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-screenshot</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-sd-video"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-sd-video</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-search"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-search</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-send"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-send</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-share"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-share</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-share-alt"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-share-alt</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-shopping-cart"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-shopping-cart</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-signal"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-signal</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-sort"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-sort</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-sort-by-alphabet"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-sort-by-alphabet</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-sort-by-alphabet-alt"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-sort-by-alphabet-alt</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-sort-by-attributes"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-sort-by-attributes</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-sort-by-attributes-alt"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-sort-by-attributes-alt</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-sort-by-order"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-sort-by-order</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-sort-by-order-alt"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-sort-by-order-alt</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-sound-5-1"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-sound-5-1</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-sound-6-1"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-sound-6-1</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-sound-7-1"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-sound-7-1</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-sound-dolby"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-sound-dolby</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-sound-stereo"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-sound-stereo</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-star"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-star</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-star-empty"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-star-empty</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-stats"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-stats</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-step-backward"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-step-backward</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-step-forward"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-step-forward</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-stop"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-stop</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-subtitles"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-subtitles</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-tag"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-tag</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-tags"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-tags</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-tasks"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-tasks</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-text-height"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-text-height</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-text-width"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-text-width</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-th"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-th</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-th-large"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-th-large</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-th-list"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-th-list</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-thumbs-down"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-thumbs-down</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-thumbs-up"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-thumbs-up</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-time"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-time</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-tint"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-tint</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-tower"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-tower</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-transfer"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-transfer</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-trash"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-trash</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-tree-conifer"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-tree-conifer</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-tree-deciduous"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-tree-deciduous</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-unchecked"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-unchecked</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-upload"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-upload</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-usd"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-usd</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-user"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-user</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-volume-down"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-volume-down</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-volume-off"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-volume-off</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-volume-up"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-volume-up</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-warning-sign"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-warning-sign</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-wrench"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-wrench</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-zoom-in"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-zoom-in</span>
      </li>
      <li>
        <span class="glyphicon glyphicon-zoom-out"></span>
        <span class="glyphicon-class">.glyphicon .glyphicon-zoom-out</span>
      </li>
    </ul>
   </div>
</div>
<!-- 以下内容只为展示字体图标而存在 -->
<style type="text/css">
.bs-glyphicons {
    list-style: none outside none;
    margin-bottom: 20px;
    overflow: hidden;
    padding-bottom: 1px;
    padding-left: 0;
}
.bs-glyphicons li {
    width: 12.5%;
}
.bs-glyphicons li {
    border: 1px solid #DDDDDD;
    float: left;
    font-size: 12px;
    height: 115px;
    line-height: 1.4;
    margin: 0 -1px -1px 0;
    padding: 10px;
    text-align: center;
    /*width: 25%;*/
}
.bs-glyphicons .glyphicon {
    font-size: 24px;
    margin-bottom: 10px;
    margin-top: 5px;
}
.bs-glyphicons .glyphicon-class {
    display: block;
    text-align: center;
}
</style>
<div class="panel panel-default" id="listgroup">
	<div class="panel-heading">
	   UL LI形式的列表
	</div>
	<ul class="list-group">
		<li class="list-group-item active">item one</li>	
		<li class="list-group-item">item two</li>	
		<li class="list-group-item">item three</li>	
		<li class="list-group-item">item four</li>	
	</ul>
</div>
<div class="panel panel-default">
<div class="panel-heading">
	以下是DIV与a组成的列表项
</div>
<div class="panel-body">
	<div class="list-group" >
	  <a href="#" class="list-group-item">不活动的列表项2</a>
	  <a href="#" class="list-group-item">不活动的列表项3</a>
	  <a href="#" class="list-group-item active">
	          这个是当前活动列表项
	  </a>
	  <a href="#" class="list-group-item">不活动的列表项4</a>
	  <a href="#" class="list-group-item">不活动的列表项5</a>
	</div>
</div>
</div>
<div class="panel panel-default" id="table">
	<div class="panel-heading">
		表格示例
	</div>
	<div class="panel-body">
		panel-body,这里可以放些说明性的文字
	</div>
	<table class="table table-bordered table-hover table-condensed">
		<thead>
			<tr><th>first name</th><th>last name</th><th>email</th>
		</thead>
		<tbody>
			<tr><td>tom</td><td>Gates</td><td>tom@gmail.com</td><tr>
			<tr><td>tom</td><td>Gates</td><td>tom@gmail.com</td><tr>
			<tr><td>tom</td><td>Gates</td><td>tom@gmail.com</td><tr>
			<tr><td>tom</td><td>Gates</td><td>tom@gmail.com</td><tr>
		</tbody>
	</table>
</div>

