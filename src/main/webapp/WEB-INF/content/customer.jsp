<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<tiles:insertDefinition name="defaultLayout">
    <tiles:putAttribute name="main">
        <div id="rightContent">
           <s:form action="searchCustomer" >
        	<tr>
        		<th><h3>CUSTOMER</h3></th>
        		<td style="padding-left: 600px;font-weight: bold;font-size: 13">Search: <input type="text" name="searchCustomer" value='<s:property value="searchCustomer"/>'> </td>
        	</tr>
        	<tr>	
        		<th><td style="padding-left: 650px;font-weight: bold;font-size: 13">
                                 <button name="submitType" value="searchCustomer" type="submit">Search</button>
                                 <button name="submitType" value="refresh" type="submit" onclick="refresh=1">Refresh</button>
                    </td></th>
        			
        	</tr>
        	<tr>
        		<th><td style="padding-left: 650px;color: red; font-weight: bold;"><s:property value="msgSearch"/></td></th>
        	</tr>	      		         	
        	</s:form>
           <div class="sukses">
                <span style="color:red;"><s:property value="msg"/></span>
                <s:if test="hasActionMessages()">
                      <s:actionmessage/>
                </s:if>
                <s:form action="addCustomer" method="post"  style="align:center">
                    <table style="font-weight: bold;font-size: 14;">
                        <tr>
	                        <th>Customer ID:</th>
	                        <td><select name="customerID" id="customerID" style="width: 160px" title="-- Select a role --">
	                            	<option value="customerID"> <s:property value="takeDate"/></option>
	                            	</select>
	                        </td>
	                        <td></td>
	                        <td></td>
	                        <td></td>
	                        <td></td>
	                        <td></td>
	                        <td></td>
	                        <td></td>
	                        <td style="">Phone:</td>
	                        <td><input type="text" name="customerPhone" style="width: 150px" value='<s:property value="customerPhone"/>'></td>
                        </tr>
                        <tr>
	                        <th>Customer Name:</th>
	                        <td><input type="text" name="customerName" style="width: 150px" value='<s:property value="customerName"/>'></td>
                        	<td></td>
	                        <td></td>
	                        <td></td>
	                        <td></td>
	                        <td></td>
	                        <td></td>
	                        <td></td>
	                        <td>Status:</td>
	                        <td><select name="customerStatus" id="customerStatus" style="width: 160px" title="-- Select a status --">
	                            	<option value="Completed"> Completed </option>
                            		<option value="Pending"> Pending </option>
	                            </select></td>
                        </tr>
                        <tr>
	                        <th>Address:</th>
	                        <td><input type="text" name="customerAddress" style="width: 150px" value='<s:property value="customerAddress"/>'></td>
                        	<td></td>
	                        <td></td>
	                        <td></td>
	                        <td></td>
	                        <td></td>
	                        <td></td>
	                        <td></td>
	                        <th></th>
	                        <td><button name="submitType" value="addCustomer" type="submit" onclick="reset();">Add</button>
                                 <button name="submitType" value="editCustomer" type="submit">Update</button></td>
                        </tr>
                        <tr>
	                        <th>Email:</th>
	                        <td><input type="text" name="customerEmail" style="width: 150px" value='<s:property value="customerEmail"/>'></td>
                        </tr>
                     </table>
               </s:form>
               <div>
                   <table class="data" border="1px" >
                         <tr class="data">
                              <th class="data"  align="center">No.</th>
                              <th class="data"  align="center">ID</th>
                              <th class="data"  align="center">Name</th>
                              <th class="data"  align="center">Address</th>
                              <th class="data"  align="center">Email</th>
                              <th class="data"  align="center">Phone</th>
                              <th class="data"  align="center">Status</th>
                              <th class="data"  align="center">Action</th>
                          </tr>
                          
                          
                          <s:iterator var="customer" value="customerALL">
                              <tr>
                              <th style="padding-left: 10px"><s:property value="#customer.customerNo"/></th>
                              <th style="padding-left: 10px"><s:property value="#customer.customerID"/></th>
                              <th style="padding-left: 10px"><s:property value="#customer.customerName"/></th>
                              <th style="padding-left: 10px"><s:property value="#customer.customerAddress"/></th>
                              <th style="padding-left: 10px"><s:property value="#customer.customerEmail"/></th>
                              <th style="padding-left: 10px"><s:property value="#customer.customerPhone"/></th>
                              <th style="padding-left: 10px"><s:property value="#customer.customerStatus"/></th>
                              <th style="padding-left: 20px">
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