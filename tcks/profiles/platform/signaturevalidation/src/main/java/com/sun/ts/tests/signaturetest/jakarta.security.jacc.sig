#Signature file v4.1
#Version 3.0

CLSS public final jakarta.security.jacc.EJBMethodPermission
cons public init(java.lang.String,java.lang.String)
cons public init(java.lang.String,java.lang.String,java.lang.String,java.lang.String[])
cons public init(java.lang.String,java.lang.String,java.lang.reflect.Method)
meth public boolean equals(java.lang.Object)
meth public boolean implies(java.security.Permission)
meth public int hashCode()
meth public java.lang.String getActions()
supr java.security.Permission
hfds actions,hashCodeValue,interfaceHash,interfaceKeys,methodInterface,methodName,methodParams,otherMethodInterface,serialPersistentFields,serialVersionUID

CLSS public final jakarta.security.jacc.EJBRoleRefPermission
cons public init(java.lang.String,java.lang.String)
meth public boolean equals(java.lang.Object)
meth public boolean implies(java.security.Permission)
meth public int hashCode()
meth public java.lang.String getActions()
supr java.security.Permission
hfds actions,hashCodeValue,serialPersistentFields,serialVersionUID

CLSS public abstract interface jakarta.security.jacc.Policy
meth public abstract java.security.PermissionCollection getPermissionCollection(javax.security.auth.Subject)
meth public boolean implies(java.security.Permission)
meth public boolean implies(java.security.Permission,java.util.Set<java.security.Principal>)
meth public boolean implies(java.security.Permission,javax.security.auth.Subject)
meth public boolean impliesByRole(java.security.Permission,javax.security.auth.Subject)
meth public boolean isExcluded(java.security.Permission)
meth public boolean isUnchecked(java.security.Permission)
meth public void refresh()

CLSS public abstract interface jakarta.security.jacc.PolicyConfiguration
meth public abstract java.lang.String getContextID() throws jakarta.security.jacc.PolicyContextException
meth public abstract java.security.PermissionCollection getExcludedPermissions()
meth public abstract java.security.PermissionCollection getUncheckedPermissions()
meth public abstract java.util.Map<java.lang.String,java.security.PermissionCollection> getPerRolePermissions()
meth public abstract void addToExcludedPolicy(java.security.Permission) throws jakarta.security.jacc.PolicyContextException
meth public abstract void addToRole(java.lang.String,java.security.Permission) throws jakarta.security.jacc.PolicyContextException
meth public abstract void addToUncheckedPolicy(java.security.Permission) throws jakarta.security.jacc.PolicyContextException
meth public abstract void delete() throws jakarta.security.jacc.PolicyContextException
meth public abstract void linkConfiguration(jakarta.security.jacc.PolicyConfiguration) throws jakarta.security.jacc.PolicyContextException
meth public abstract void removeExcludedPolicy() throws jakarta.security.jacc.PolicyContextException
meth public abstract void removeRole(java.lang.String) throws jakarta.security.jacc.PolicyContextException
meth public abstract void removeUncheckedPolicy() throws jakarta.security.jacc.PolicyContextException
meth public boolean inService() throws jakarta.security.jacc.PolicyContextException
meth public void addToExcludedPolicy(java.security.PermissionCollection) throws jakarta.security.jacc.PolicyContextException
meth public void addToRole(java.lang.String,java.security.PermissionCollection) throws jakarta.security.jacc.PolicyContextException
meth public void addToUncheckedPolicy(java.security.PermissionCollection) throws jakarta.security.jacc.PolicyContextException
meth public void commit() throws jakarta.security.jacc.PolicyContextException

CLSS public abstract jakarta.security.jacc.PolicyConfigurationFactory
cons public init()
cons public init(jakarta.security.jacc.PolicyConfigurationFactory)
fld public final static java.lang.String FACTORY_NAME = "jakarta.security.jacc.PolicyConfigurationFactory.provider"
meth public abstract boolean inService(java.lang.String) throws jakarta.security.jacc.PolicyContextException
meth public abstract jakarta.security.jacc.PolicyConfiguration getPolicyConfiguration()
meth public abstract jakarta.security.jacc.PolicyConfiguration getPolicyConfiguration(java.lang.String)
meth public abstract jakarta.security.jacc.PolicyConfiguration getPolicyConfiguration(java.lang.String,boolean) throws jakarta.security.jacc.PolicyContextException
meth public jakarta.security.jacc.PolicyConfigurationFactory getWrapped()
meth public static jakarta.security.jacc.PolicyConfigurationFactory get()
meth public static jakarta.security.jacc.PolicyConfigurationFactory getPolicyConfigurationFactory() throws jakarta.security.jacc.PolicyContextException,java.lang.ClassNotFoundException
meth public static void setPolicyConfigurationFactory(jakarta.security.jacc.PolicyConfigurationFactory)
supr java.lang.Object
hfds policyConfigurationFactory,wrapped

CLSS public final jakarta.security.jacc.PolicyContext
fld public final static java.lang.String HTTP_SERVLET_REQUEST = "jakarta.servlet.http.HttpServletRequest"
fld public final static java.lang.String PRINCIPAL_MAPPER = "jakarta.security.jacc.PrincipalMapper"
fld public final static java.lang.String SOAP_MESSAGE = "jakarta.xml.soap.SOAPMessage"
fld public final static java.lang.String SUBJECT = "javax.security.auth.Subject.container"
meth public static <%0 extends java.lang.Object> {%%0} get(java.lang.String)
meth public static <%0 extends java.lang.Object> {%%0} getContext(java.lang.String) throws jakarta.security.jacc.PolicyContextException
meth public static java.lang.String getContextID()
meth public static java.util.Set<java.lang.String> getHandlerKeys()
meth public static void registerHandler(java.lang.String,jakarta.security.jacc.PolicyContextHandler,boolean) throws jakarta.security.jacc.PolicyContextException
meth public static void setContextID(java.lang.String)
meth public static void setHandlerData(java.lang.Object)
supr java.lang.Object
hfds handlerTable,threadLocalContextID,threadLocalHandlerData

CLSS public jakarta.security.jacc.PolicyContextException
cons public init()
cons public init(java.lang.String)
cons public init(java.lang.String,java.lang.Throwable)
cons public init(java.lang.Throwable)
supr java.lang.Exception
hfds serialVersionUID

CLSS public abstract interface jakarta.security.jacc.PolicyContextHandler
meth public abstract boolean supports(java.lang.String) throws jakarta.security.jacc.PolicyContextException
meth public abstract java.lang.Object getContext(java.lang.String,java.lang.Object) throws jakarta.security.jacc.PolicyContextException
meth public abstract java.lang.String[] getKeys() throws jakarta.security.jacc.PolicyContextException

CLSS public abstract jakarta.security.jacc.PolicyFactory
cons public init()
cons public init(jakarta.security.jacc.PolicyFactory)
fld public final static java.lang.String FACTORY_NAME = "jakarta.security.jacc.PolicyFactory.provider"
meth public abstract jakarta.security.jacc.Policy getPolicy(java.lang.String)
meth public abstract void setPolicy(java.lang.String,jakarta.security.jacc.Policy)
meth public jakarta.security.jacc.Policy getPolicy()
meth public jakarta.security.jacc.PolicyFactory getWrapped()
meth public static jakarta.security.jacc.PolicyFactory getPolicyFactory()
meth public static void setPolicyFactory(jakarta.security.jacc.PolicyFactory)
meth public void setPolicy(jakarta.security.jacc.Policy)
supr java.lang.Object
hfds policyFactory,wrapped

CLSS public abstract interface jakarta.security.jacc.PrincipalMapper
meth public abstract java.security.Principal getCallerPrincipal(javax.security.auth.Subject)
meth public abstract java.util.Set<java.lang.String> getMappedRoles(javax.security.auth.Subject)
meth public boolean isAnyAuthenticatedUserRoleMapped()
meth public java.security.Principal getCallerPrincipal(java.util.Set<java.security.Principal>)
meth public java.util.Set<java.lang.String> getMappedRoles(java.util.Set<java.security.Principal>)

CLSS public final jakarta.security.jacc.WebResourcePermission
cons public init(jakarta.servlet.http.HttpServletRequest)
cons public init(java.lang.String,java.lang.String)
cons public init(java.lang.String,java.lang.String[])
meth public boolean equals(java.lang.Object)
meth public boolean implies(java.security.Permission)
meth public int hashCode()
meth public java.lang.String getActions()
supr java.security.Permission
hfds EMPTY_STRING,ESCAPED_COLON,hashCodeValue,methodSpec,serialPersistentFields,serialVersionUID,urlPatternSpec

CLSS public final jakarta.security.jacc.WebRoleRefPermission
cons public init(java.lang.String,java.lang.String)
intf java.io.Serializable
meth public boolean equals(java.lang.Object)
meth public boolean implies(java.security.Permission)
meth public int hashCode()
meth public java.lang.String getActions()
supr java.security.Permission
hfds actions,hashCodeValue,serialPersistentFields,serialVersionUID

CLSS public final jakarta.security.jacc.WebUserDataPermission
cons public init(jakarta.servlet.http.HttpServletRequest)
cons public init(java.lang.String,java.lang.String)
cons public init(java.lang.String,java.lang.String[],java.lang.String)
meth public boolean equals(java.lang.Object)
meth public boolean implies(java.security.Permission)
meth public int hashCode()
meth public java.lang.String getActions()
supr java.security.Permission
hfds EMPTY_STRING,ESCAPED_COLON,TT_CONFIDENTIAL,TT_NONE,hashCodeValue,methodSpec,serialPersistentFields,serialVersionUID,transportHash,transportKeys,transportType,urlPatternSpec

CLSS public abstract interface java.io.Serializable

CLSS public java.lang.Exception
cons protected init(java.lang.String,java.lang.Throwable,boolean,boolean)
cons public init()
cons public init(java.lang.String)
cons public init(java.lang.String,java.lang.Throwable)
cons public init(java.lang.Throwable)
supr java.lang.Throwable
hfds serialVersionUID

CLSS public java.lang.Object
cons public init()
meth protected java.lang.Object clone() throws java.lang.CloneNotSupportedException
meth protected void finalize() throws java.lang.Throwable
 anno 0 java.lang.Deprecated(boolean forRemoval=false, java.lang.String since="9")
meth public boolean equals(java.lang.Object)
meth public final java.lang.Class<?> getClass()
meth public final void notify()
meth public final void notifyAll()
meth public final void wait() throws java.lang.InterruptedException
meth public final void wait(long) throws java.lang.InterruptedException
meth public final void wait(long,int) throws java.lang.InterruptedException
meth public int hashCode()
meth public java.lang.String toString()

CLSS public java.lang.Throwable
cons protected init(java.lang.String,java.lang.Throwable,boolean,boolean)
cons public init()
cons public init(java.lang.String)
cons public init(java.lang.String,java.lang.Throwable)
cons public init(java.lang.Throwable)
intf java.io.Serializable
meth public final java.lang.Throwable[] getSuppressed()
meth public final void addSuppressed(java.lang.Throwable)
meth public java.lang.StackTraceElement[] getStackTrace()
meth public java.lang.String getLocalizedMessage()
meth public java.lang.String getMessage()
meth public java.lang.String toString()
meth public java.lang.Throwable fillInStackTrace()
meth public java.lang.Throwable getCause()
meth public java.lang.Throwable initCause(java.lang.Throwable)
meth public void printStackTrace()
meth public void printStackTrace(java.io.PrintStream)
meth public void printStackTrace(java.io.PrintWriter)
meth public void setStackTrace(java.lang.StackTraceElement[])
supr java.lang.Object
hfds CAUSE_CAPTION,EMPTY_THROWABLE_ARRAY,NULL_CAUSE_MESSAGE,SELF_SUPPRESSION_MESSAGE,SUPPRESSED_CAPTION,SUPPRESSED_SENTINEL,UNASSIGNED_STACK,backtrace,cause,depth,detailMessage,serialVersionUID,stackTrace,suppressedExceptions
hcls PrintStreamOrWriter,SentinelHolder,WrappedPrintStream,WrappedPrintWriter

CLSS public abstract interface java.security.Guard
meth public abstract void checkGuard(java.lang.Object)

CLSS public abstract java.security.Permission
cons public init(java.lang.String)
intf java.io.Serializable
intf java.security.Guard
meth public abstract boolean equals(java.lang.Object)
meth public abstract boolean implies(java.security.Permission)
meth public abstract int hashCode()
meth public abstract java.lang.String getActions()
meth public final java.lang.String getName()
meth public java.lang.String toString()
meth public java.security.PermissionCollection newPermissionCollection()
meth public void checkGuard(java.lang.Object)
supr java.lang.Object
hfds name,serialVersionUID

