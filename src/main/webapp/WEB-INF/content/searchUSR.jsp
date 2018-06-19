<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<tiles:insertDefinition name="defaultLayout">
    <tiles:putAttribute name="main">
        <div id="rightContent">
           <h3>USER</h3>
           <div class="sukses">
                <s:form action="searchUser">
                	<th style="padding-left: 700px;font-weight: bold;font-size: 16;" align="right">Search: 
                	<s:textfield name="searchValue" label="Search value"/> 
                	<s:submit value="Search"></s:submit>
                	</th>
                </s:form>
               <s:form action="addUser" method="post"  style="align:center">
                    <table>
                        <tr>
                        <th style="font-weight: bold;">UserName: </th>
                        <td><input type="text" name="userName" value='<s:property value="userName"/>'></td>
                        <td style="color: red;font-weight: bold;font-size: 16"><s:property value="msgName"/></td>
                        <td></td>
                        </tr>
                        <tr>
                        <th style="font-weight: bold;">Password:</th>
                        <td><input type="password"  name="password" value='<s:property value="password"/>'></td>
                        <td style="color: red; font-weight: bold;font-size: 16"><s:property value="msgPwd"/></td>
                        </tr>
                        <tr>
                        <th style="font-weight: bold;">Role: </th>
                        <td>
                        <select name="role" id="role" style="width: 150px" title="-- Select a role --">
                            							<option value="Administrator"> Administrator </option>
                            							<option value="Employee"> Employee </option>
                        </select>
						</td>
                        </tr>
                        <tr>
                            <th></th>
                            <td>
                                 <button name="submitType" value="addUser" type="submit">Add</button>
                                 <button name="submitType" value="editUser" type="submit">Update</button>
                            </td>
                        </tr>
                        <tr>
                        <th></th>
                        <td style="color: green;font-weight: bold;font-size: 16"><s:if test="hasActionMessages()">
                      				<s:actionmessage/>
                			</s:if></td>
                			<th><span style="color:red;"><s:property value="msg"/></span></th>
                        </tr>
                     </table>
               </s:form> 
               <div>
                   <table class="data" border="1px">
                         <tr class="data">
                              <th class="data" align="center">No</th>
                              <th class="data" align="center">User Name </th>
                              <th class="data" align="center">Password </th>
                              <th class="data" align="center">Role </th>
                              <th class="data" align="center">Action</th>
                          </tr>
                          <s:iterator var="user" value="list">
                              <tr>
                              <th width="30px"><s:property value="#user.accountid"/></th>
                              <th style="padding-left: 10px"><s:property value="#user.userName"/></th>
                              <th style="padding-left: 10px"><s:property value="#user.password"/></th>
                              <th style="padding-left: 10px"><s:property value="#user.role"/></th>
                              <th style="padding-left: 10px">
                              <a href="editUser.action?accountid=<s:property value="#user.accountid"/>">
                                    <button style="background-color: #6633FF;color: white;">Edit</button>
                              </a>
                              <a href="deleteUser.action?accountId=<s:property value="#user.accountid"/>" onClick="return confirm('Do you want to delete this user?');">
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