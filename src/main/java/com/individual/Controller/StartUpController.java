package com.individual.Controller;

import java.io.IOException;
import java.security.Principal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.AuthenticatedPrincipal;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.individual.Entity.AppUser;
import com.individual.Entity.UserRole;
import com.individual.ServiceImpl.AppRoleServiceImpl;
import com.individual.ServiceImpl.AppUserServiceImpl;
import com.individual.ServiceImpl.UserRoleServiceImpl;
import com.individual.Utils.AppRole;;

@Controller
public class StartUpController {

	@Autowired
	AppUserServiceImpl appUser;

	@RequestMapping(value = { "/login" }, method = RequestMethod.GET)
	public String Login(@RequestParam(name = "error", required = false) String error, Model model) {
		if (error != null) {
			model.addAttribute("loginfail", "1");
		}
		return "login";
	}

	@RequestMapping("/logout")
	public String Logout(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession(false);
		SecurityContextHolder.clearContext();
		session = request.getSession(false);
		if (session != null) {
			session.invalidate();
		}

		for (Cookie cookie : request.getCookies()) {
			cookie.setMaxAge(0);
		}
		return "redirect:/login";
	}

	@RequestMapping(value = { "/403" }, method = RequestMethod.GET)
	public String AccessDenied() {
		return "403";

	}

	@RequestMapping(value = { "/", "/admin", "/user" }, method = RequestMethod.GET)
	public String DefaultUrl(HttpServletRequest req) {
		String adminUrl = "redirect:/admin/dashboard";
		String userUrl = "redirect:/user/dashboard";
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth == null) {
			return "redirect:/login";
		}
		Set<String> userRoles = new HashSet<String>();
		auth.getAuthorities().forEach(role -> {
			userRoles.add(role.getAuthority());
		});
		if (userRoles.contains(AppRole.ROLE_ADMIN)) {
			return adminUrl;
		} else {

			return userUrl;
		}
	}
}
