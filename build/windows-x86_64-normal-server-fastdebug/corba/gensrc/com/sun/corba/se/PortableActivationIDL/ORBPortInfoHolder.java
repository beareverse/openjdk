package com.sun.corba.se.PortableActivationIDL;

/**
* com/sun/corba/se/PortableActivationIDL/ORBPortInfoHolder.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从d:/xysziv/openjdk/corba/src/share/classes/com/sun/corba/se/PortableActivationIDL/activation.idl
* 2021年6月2日 星期三 下午10时51分19秒 CST
*/

public final class ORBPortInfoHolder implements org.omg.CORBA.portable.Streamable
{
  public com.sun.corba.se.PortableActivationIDL.ORBPortInfo value = null;

  public ORBPortInfoHolder ()
  {
  }

  public ORBPortInfoHolder (com.sun.corba.se.PortableActivationIDL.ORBPortInfo initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = com.sun.corba.se.PortableActivationIDL.ORBPortInfoHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    com.sun.corba.se.PortableActivationIDL.ORBPortInfoHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return com.sun.corba.se.PortableActivationIDL.ORBPortInfoHelper.type ();
  }

}