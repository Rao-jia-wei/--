<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<html>
  <head>
	<%@ include file="header.jspf" %>
  </head>
	
	 <body  style="background: url(image/bg.jpg) repeat;">  
    	<div class="container">
    		<%@ include file="head.jsp" %>
    		<div class="row" style="margin-top: 70px ;">
    				<div class="col-xs-3">
						<%@ include file="left.jsp" %>
    				</div>
					<div class="col-xs-9">
					<div class="panel panel-info" >
					  <div class="panel-heading">
					    <h3 class="panel-title">
					    	<div class="row">
					    		<div class="col-xs-8">
					    			${position.name }
					    		</div>
					    		<div class="col-xs-4">
					    			招聘截止日期:<fm:formatDate value="${position.endDate }"/>
					    		</div>
					    	</div>
					     </h3>
					   </div>
					  </div>
			
					 
				
					<div class="panel panel-info" style="margin-top: 20px">
					  <div class="panel-body">
						  		<table class="table table-striped table-hover table-bordered">
						  			<tr>
						  				<td class="info">职位类型</td>
						  				<td>${position.position }</td>
						  				
						  				<td class="info">职位性质</td>
						  				<td>${position.type}</td>
						  				
						  				<td class="info">工作经验</td>
						  				<td>${position.workExper }</td>
						  			</tr>
						  			
						  			<tr>
						  				<td class="info">最低学历：</td>
						  				<td>${position.educationNeed}</td>
						  				<td class="info">薪资待遇:</td>
						  				<td>${position.salary }</td>
						  				
						  				<td class="info">语言要求:</td>
						  				<td>${position.languageNeed }</td>
						  				
						  				
						  			</tr>
						  			<tr>
						  				<td class="info">工作地点</td>
						  				<td>${position.workPlace}</td>
						  				<td class="info">招聘人数</td>
						  				<td>${position.recruitNumber }</td>
						  				
						  				<td class="info"></td>
						  				<td></td>
						  			</tr>
						  			
						  				
						  		</table>
						  		<div class="panel panel-info">
								  <div class="panel-heading">
								  	岗位要求 
								  </div>
								  <div class="panel-body" style="padding-top: 50px;padding-bottom: 50px">
								   			${position.positionInfo }
								  </div>
								 
								</div>
								
							<div class="row">
								<div class="col-xs--4 col-xs-offset-8">	
									
								</div>
								
							</div>
					  </div>
					 </div>
					</div>
					  		
					
					</div>
				</div>

    		
    	</div>
    	<%@ include file="buttom.jsp" %>
  </body>
</html>
