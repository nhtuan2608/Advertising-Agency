<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<tiles:insertDefinition name="defaultLayout">
    <tiles:putAttribute name="main">
        <div id="rightContent">
           <h3>customer</h3>
           <div class="sukses">
                <span style="color:red;"><s:property value="msg"/></span>
                <s:if test="hasActionMessages()">
                      <s:actionmessage/>
                </s:if>
                <br><br>
                <s:form action="addType" method="post"  style="align:center">
                    <table>
                        <tr>
                        	<th><b>ID Advertising's type: 	</b><input type="text"  name="AdvertisingTypeID" value='<s:property value="AdvertisingTypeID"/>'></th>
                            <th><b>Type Name:  				</b><input type="text" name="NameType" value='<s:property value="NameType"/>'></th><br>
                            <th><b>Create Date:       		</b><input type="text"  name="CreateDateType" value='<s:property value="CreateDateType"/>'></th>
                            
                        </tr>
                        <tr>
                            <th>
                                 <button name="submitType" value="addType" type="submit">Add</button>
                                 <button name="submitType" value="editType" type="submit">Update</button>
                            </th>
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
                          <s:iterator var="type" value="typeALL">
                              <tr>
                              <th width="30px"><s:property value="#type.AdvertisingTypeID"/></th>
                              <th><s:property value="#type.NameType"/></th>
                              <th><s:property value="#type.CreateDateType"/></th>
                              <th>
                              <a href="editcustomer.action?customerId=<s:property value="#customer.customerId"/>">
                                    <button style="background-color: #008CBA;color: white;">Edit</button>
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