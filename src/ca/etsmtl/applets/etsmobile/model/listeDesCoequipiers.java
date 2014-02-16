package ca.etsmtl.applets.etsmobile.model;

//----------------------------------------------------
//
// Generated by www.easywsdl.com
// Version: 2.0.0.4
//
// Created by Quasar Development at 15-01-2014
//
//---------------------------------------------------

import java.util.Hashtable;
import org.ksoap2.serialization.*;

import ca.etsmtl.applets.etsmobile.http.soap.ExtendedSoapSerializationEnvelope;

public class listeDesCoequipiers extends DonneesRetournees implements KvmSerializable {

	public ArrayOfPersonne liste = new ArrayOfPersonne();

	public listeDesCoequipiers() {
	}

	public listeDesCoequipiers(AttributeContainer inObj, ExtendedSoapSerializationEnvelope envelope) {
		super(inObj, envelope);
		if (inObj == null)
			return;

		SoapObject soapObject = (SoapObject) inObj;

		if (soapObject.hasProperty("liste")) {
			SoapObject j = (SoapObject) soapObject.getProperty("liste");
			liste = new ArrayOfPersonne(j, envelope);
		}

	}

	@Override
	public Object getProperty(int propertyIndex) {
		int count = super.getPropertyCount();
		if (propertyIndex == count + 0) {
			return liste;
		}
		return super.getProperty(propertyIndex);
	}

	@Override
	public int getPropertyCount() {
		return super.getPropertyCount() + 1;
	}

	@Override
	public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1,
			PropertyInfo info) {
		int count = super.getPropertyCount();
		if (propertyIndex == count + 0) {
			info.type = PropertyInfo.VECTOR_CLASS;
			info.name = "liste";
			info.namespace = "http://etsmtl.ca/";
		}
		super.getPropertyInfo(propertyIndex, arg1, info);
	}

	@Override
	public void setProperty(int arg0, Object arg1) {
	}

}
