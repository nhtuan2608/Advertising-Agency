<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

  <link rel="stylesheet" href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="https:/resources/demos/style.css">
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
  <script>
  $( function() {
    $( "#datepicker" ).datepicker({
    	changeMonth: true,
    	changeYear: true,
    	yearRange: "2000:2050",
    	dateFormat: "yy/mm/dd",
    	duration: "slow"
    });
  } );
 </script>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<tiles:insertDefinition name="defaultLayout">
    <tiles:putAttribute name="main">
        <div id="rightContent">
           <s:form action="searchType" >
        	<tr>
        		<th><h3>ADVERTISING TYPE</h3></th>
        		<td style="padding-left: 550px;font-weight: bold;font-size: 13">Search: <input type="text" name="searchType" value='<s:property value="searchType"/>'> </td>
        	</tr>
        	<tr>	
        		<th><td style="padding-left: 600px;font-weight: bold;font-size: 13">
                                 <button name="submitType" value="searchType" type="submit">Search</button>
                                 <button name="submitType" value="refresh" type="submit" onclick="refresh=1">Refresh</button>
                    </td></th>
        			
        	</tr>
        	<tr>
        		<th><td style="padding-left: 600px;color: red; font-weight: bold;"><s:property value="msgSearch"/></td></th>
        	</tr>	      		         	
        	</s:form>
           <div class="sukses">
                <span style="color:red;"><s:property value="msg"/></span>
                <s:if test="hasActionMessages()">
                      <s:actionmessage/>
                </s:if>
                <s:form action="addType" method="post"  style="align:center">
                    <table>
                        <tr>
                        <th>ID Advertising's type:</th>
                        <td><input type="text"  name="AdvertisingTypeID" value='<s:property value="AdvertisingTypeID"/>'></td>
                        </tr>
                        <tr>
                        <th>Type Name:</th>
                        <td><input type="text" name="NameType" value='<s:property value="NameType"/>'></td>
                        </tr>
                        <tr>
                        <th>Create Date:</th>
                        <td><input type="text" id="datepicker"  name="CreateDateType" value='<s:property value="CreateDateType"/>'></td>
                        </tr>
                        <tr>
                            <th></th>
                            <td>
                                 <button name="submitType" value="addType" type="submit">Add</button>
                                 <button name="submitType" value="editType" type="submit">Update</button>
                            </td>
                        </tr>
                     </table>
               </s:form> 
               <div>
                   <table class="data" border=1px>
                         <tr class="data">
                              <th class="data" width="200px" align="center">ID Advertising's type</th>
                              <th class="data" align="center">Type Name</th>
                              <th class="data" align="center">Create Date</th>
                              <th class="data" align="center">Action</th>
                          </tr>
                          <s:iterator var="type" value="typeALL">
                              <tr>
                              <th width="30px" style="padding-left: 10px"><s:property value="#type.AdvertisingTypeID"/></th>
                              <th style="padding-left: 10px"><s:property value="#type.NameType"/></th>
                              <th style="padding-left: 10px"><s:property value="#type.CreateDateType"/></th>
                              <th style="padding-left: 10px" width="100px">
                              <a href="editType.action?customerId=<s:property value="#customer.customerId"/>">
                                    <button style="background-color: #6633FF;color: white;">Edit</button>
                              </a>
                              <a href="deleteType.action?AdvertisingTypeID=<s:property value="#type.AdvertisingTypeID"/>" onClick="return confirm('Do you want to delete this customer?');">
                                    <button style="background-color: red;color: white;">Delete</button>
                              </a>
                              </th>
                              </tr>
                          </s:iterator>
                   </table>
               </div>
           </div>
        </div>
        
    </tiles:putAttribute>
</tiles:insertDefinition>