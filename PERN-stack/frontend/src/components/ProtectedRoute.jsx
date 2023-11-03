import { Navigate, Outlet } from 'react-router-dom';

export const ProtectedRoute = ({redirecTo, isAllowed, children}) => {
    if(!isAllowed)return <Navigate to={redirecTo} replace />;
    
    return children ? children : <Outlet />;
}