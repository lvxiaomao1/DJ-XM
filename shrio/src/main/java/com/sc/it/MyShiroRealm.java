package com.sc.it;

import java.util.HashSet;
import java.util.Set;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

public class MyShiroRealm   extends AuthorizingRealm {
	  private static final String USER_NAME = "lvxiaomao";  
	    private static final String PASSWORD = "123456"; 
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		// TODO Auto-generated method stub
		 Set<String> roleNames = new HashSet<String>();  
	        Set<String> permissions = new HashSet<String>();  
	        roleNames.add("administrator");//添加角色
	        permissions.add("newPage.jhtml");  //添加权限
	        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo(roleNames);  
	        info.setStringPermissions(permissions);  
	        return info;

		
		
		
	
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authcToken) throws AuthenticationException {
		// TODO Auto-generated method stub
		 UsernamePasswordToken token = (UsernamePasswordToken) authcToken;
	        if(token.getUsername().equals(USER_NAME)){
	            return new SimpleAuthenticationInfo(USER_NAME, PASSWORD, getName());  
	        }else{
	            throw new AuthenticationException();  
	        }

		
		
		
	}

}