package co.com.ic2.colciencias.utilidades.usuario;

import java.util.List;

import com.liferay.portal.kernel.cache.MultiVMPoolUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.Role;
import com.liferay.portal.model.User;
import com.liferay.portal.service.RoleLocalServiceUtil;
import com.liferay.portal.service.UserLocalServiceUtil;

public enum UsuarioUtil {
INSTANCE;

	public void asignarRol(long companyId, long userId,String rol) throws PortalException, SystemException{
	    User user = UserLocalServiceUtil.getUser(userId);
	    Role liferayRole = RoleLocalServiceUtil.fetchRole(companyId, rol);
	    RoleLocalServiceUtil.addUserRole(user.getUserId(), liferayRole.getRoleId());
	    UserLocalServiceUtil.updateUser(user);
	    MultiVMPoolUtil.clear();
	}
	
	public void retirarRol(long companyId, long userId,String rol) throws PortalException, SystemException{
	    User user = UserLocalServiceUtil.getUser(userId);
	    Role liferayRole = RoleLocalServiceUtil.fetchRole(companyId, rol);
	    RoleLocalServiceUtil.deleteUserRole(user.getUserId(), liferayRole.getRoleId());
	    UserLocalServiceUtil.updateUser(user);
	    MultiVMPoolUtil.clear();
	}

	public Boolean buscarRol(List<Role> roles,String nombre){
		for(Role rol:roles){
			if(rol.getName().equals(nombre)){
				return true;
			}
		}
		return false;
	}
}
