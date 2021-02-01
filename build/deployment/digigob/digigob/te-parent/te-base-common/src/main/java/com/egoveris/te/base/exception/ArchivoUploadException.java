package com.egoveris.te.base.exception;

import org.terasoluna.plus.common.exception.ApplicationException;

/**
 * @author eduavega Esta clase tiene como responsabilidad personalizar el
 *         mensaje de error al subir un archivo que excede el maximo permitido.
 *
 */

public class ArchivoUploadException extends ApplicationException {

  private static final long serialVersionUID = -2650039278697349216L;

  public ArchivoUploadException(Throwable cause) {
    super("Se ha producido un error al cargar un archivo", cause);
  }

  public ArchivoUploadException(String mensaje, Throwable cause) {
    super(mensaje, cause);
  }


}
