// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

public class Registration
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject registrationMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MyFirstModule.Registration";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Number("Number"),
		Date("Date"),
		Attended("Attended"),
		Registration_TrainingEvent("MyFirstModule.Registration_TrainingEvent"),
		Registration_Trainee("MyFirstModule.Registration_Trainee");

		private final java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public Registration(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected Registration(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject registrationMendixObject)
	{
		if (registrationMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, registrationMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.registrationMendixObject = registrationMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Registration.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static myfirstmodule.proxies.Registration initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return myfirstmodule.proxies.Registration.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static myfirstmodule.proxies.Registration initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new myfirstmodule.proxies.Registration(context, mendixObject);
	}

	public static myfirstmodule.proxies.Registration load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return myfirstmodule.proxies.Registration.initialize(context, mendixObject);
	}

	public static java.util.List<myfirstmodule.proxies.Registration> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> myfirstmodule.proxies.Registration.initialize(context, obj))
			.collect(java.util.stream.Collectors.toList());
	}

	/**
	 * Commit the changes made on this proxy object.
	 * @throws com.mendix.core.CoreException
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 * @throws com.mendix.core.CoreException
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of Number
	 */
	public final java.lang.Long getNumber()
	{
		return getNumber(getContext());
	}

	/**
	 * @param context
	 * @return value of Number
	 */
	public final java.lang.Long getNumber(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.Number.toString());
	}

	/**
	 * Set value of Number
	 * @param number
	 */
	public final void setNumber(java.lang.Long number)
	{
		setNumber(getContext(), number);
	}

	/**
	 * Set value of Number
	 * @param context
	 * @param number
	 */
	public final void setNumber(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long number)
	{
		getMendixObject().setValue(context, MemberNames.Number.toString(), number);
	}

	/**
	 * @return value of Date
	 */
	public final java.util.Date getDate()
	{
		return getDate(getContext());
	}

	/**
	 * @param context
	 * @return value of Date
	 */
	public final java.util.Date getDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.Date.toString());
	}

	/**
	 * Set value of Date
	 * @param date
	 */
	public final void setDate(java.util.Date date)
	{
		setDate(getContext(), date);
	}

	/**
	 * Set value of Date
	 * @param context
	 * @param date
	 */
	public final void setDate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date date)
	{
		getMendixObject().setValue(context, MemberNames.Date.toString(), date);
	}

	/**
	 * @return value of Attended
	 */
	public final java.lang.Boolean getAttended()
	{
		return getAttended(getContext());
	}

	/**
	 * @param context
	 * @return value of Attended
	 */
	public final java.lang.Boolean getAttended(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Attended.toString());
	}

	/**
	 * Set value of Attended
	 * @param attended
	 */
	public final void setAttended(java.lang.Boolean attended)
	{
		setAttended(getContext(), attended);
	}

	/**
	 * Set value of Attended
	 * @param context
	 * @param attended
	 */
	public final void setAttended(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean attended)
	{
		getMendixObject().setValue(context, MemberNames.Attended.toString(), attended);
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of Registration_TrainingEvent
	 */
	public final myfirstmodule.proxies.TrainingEvent getRegistration_TrainingEvent() throws com.mendix.core.CoreException
	{
		return getRegistration_TrainingEvent(getContext());
	}

	/**
	 * @param context
	 * @return value of Registration_TrainingEvent
	 * @throws com.mendix.core.CoreException
	 */
	public final myfirstmodule.proxies.TrainingEvent getRegistration_TrainingEvent(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		myfirstmodule.proxies.TrainingEvent result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Registration_TrainingEvent.toString());
		if (identifier != null) {
			result = myfirstmodule.proxies.TrainingEvent.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of Registration_TrainingEvent
	 * @param registration_trainingevent
	 */
	public final void setRegistration_TrainingEvent(myfirstmodule.proxies.TrainingEvent registration_trainingevent)
	{
		setRegistration_TrainingEvent(getContext(), registration_trainingevent);
	}

	/**
	 * Set value of Registration_TrainingEvent
	 * @param context
	 * @param registration_trainingevent
	 */
	public final void setRegistration_TrainingEvent(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.TrainingEvent registration_trainingevent)
	{
		if (registration_trainingevent == null) {
			getMendixObject().setValue(context, MemberNames.Registration_TrainingEvent.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.Registration_TrainingEvent.toString(), registration_trainingevent.getMendixObject().getId());
		}
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of Registration_Trainee
	 */
	public final myfirstmodule.proxies.Trainee getRegistration_Trainee() throws com.mendix.core.CoreException
	{
		return getRegistration_Trainee(getContext());
	}

	/**
	 * @param context
	 * @return value of Registration_Trainee
	 * @throws com.mendix.core.CoreException
	 */
	public final myfirstmodule.proxies.Trainee getRegistration_Trainee(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		myfirstmodule.proxies.Trainee result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Registration_Trainee.toString());
		if (identifier != null) {
			result = myfirstmodule.proxies.Trainee.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of Registration_Trainee
	 * @param registration_trainee
	 */
	public final void setRegistration_Trainee(myfirstmodule.proxies.Trainee registration_trainee)
	{
		setRegistration_Trainee(getContext(), registration_trainee);
	}

	/**
	 * Set value of Registration_Trainee
	 * @param context
	 * @param registration_trainee
	 */
	public final void setRegistration_Trainee(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.Trainee registration_trainee)
	{
		if (registration_trainee == null) {
			getMendixObject().setValue(context, MemberNames.Registration_Trainee.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.Registration_Trainee.toString(), registration_trainee.getMendixObject().getId());
		}
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return registrationMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this) {
			return true;
		}
		if (obj != null && getClass().equals(obj.getClass()))
		{
			final myfirstmodule.proxies.Registration that = (myfirstmodule.proxies.Registration) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return entityName;
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
