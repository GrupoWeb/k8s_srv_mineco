package com.egoveris.te.base.exception;

import org.terasoluna.plus.common.exception.ApplicationException;

public class BuscarTareaException extends ApplicationException {

  private static final long serialVersionUID = -2650039278697349216L;

  public BuscarTareaException(Throwable cause) {
    super("Se ha producido un error al buscar una tarea", cause);
  }

  public BuscarTareaException(String mensaje, Throwable cause) {
    super(mensaje, cause);
  }


}
