package com.egoveris.deo.ws.exception;

import org.terasoluna.plus.common.exception.ApplicationException;

/**
 * La excepción se genera cuando se han presentado errores al acceder a los
 * datos del documento.
 *
 */

public class ErrorConsultaDocumentoException extends ApplicationException {

  private static final long serialVersionUID = -885033084082354144L;
  private static final String mensajeError = "Error en la búsqueda de documento ";

  public ErrorConsultaDocumentoException(final String msg) {
    super(mensajeError + msg);
  }

  public ErrorConsultaDocumentoException(final String msg, Throwable cause) {
    super(mensajeError + msg, cause);
  }
}
