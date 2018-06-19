<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<tiles:insertDefinition name="defaultLayout">
    <tiles:putAttribute name="main">
        <div id="rightContent">
           <s:form action="searchCustomer" >
        	<tr>
        		<th><h3>ORDER</h3></th>
        		<td style="padding-left: 700px;font-weight: bold;font-size: 13">Search: <input type="text" name="searchCustomer" value='<s:property value="searchCustomer"/>'> </td>
        	</tr>
        	<tr>	
        		<th><td style="padding-left: 750px;font-weight: bold;font-size: 13">
                                 <button name="submitType" value="searchCustomer" type="submit">Search</button>
                                 <button name="submitType" value="refresh" type="submit" onclick="refresh=1">Refresh</button>
                    </td></th>
        			
        	</tr>
        	<tr>
        		<th><td style="padding-left: 750px;color: red; font-weight: bold;"><s:property value="msgSearch"/></td></th>
        	</tr>	      		         	
        	</s:form>
           <div class="sukses">
                <span style="color:red;"><s:property value="msg"/></span>
                <s:if test="hasActionMessages()">
                      <s:actionmessage/>
                </s:if>
                <br><br>
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
                        	<td><input type="text"  name="CreateDateType" value='<s:property value="CreateDateType"/>'></td>
                            
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
                   <table class="data">
                         <tr class="data">
                              <th class="data" width="30px">No</th>
                              <th class="data">ID Advertising's type</th>
                              <th class="data">Type Name</th>
                              <th class="data">Create Date</th>
                          </tr>
                          <s:iterator var="order" value="orderALL">
                              <tr>
                              <th width="30px"><s:property value="#order.OrderID"/></th>
                              <th><s:property value="#order.CustomerNo"/></th>
                              <th><s:property value="#order.OrderStatus"/></th>
                              <th><s:property value="#order.AccountID"/></th>
                              <th><s:property value="#order.OrderDate"/></th>
                              <th><s:property value="#order.OrderRelease"/></th>
                              <th><s:property value="#order.PaymentStatus"/></th>
                              <th>
                              <a href="editcustomer.action?customerId=<s:property value="#customer.customerId"/>">
                                    <button style="background-color: #6633FF;color: white;">Edit</button>
                              </a>
                              <a href="deletecustomer.action?customerId=<s:property value="#customer.customerId"/>" onClick="return confirm('Do you want to delete this customer?');">
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