
package ws;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10-b140803.1500
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Servicios", targetNamespace = "http://WS/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Servicios {


    /**
     * 
     * @param precio
     * @param proveedor
     * @param stock
     * @param nombre
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "add", targetNamespace = "http://WS/", className = "ws.Add")
    @ResponseWrapper(localName = "addResponse", targetNamespace = "http://WS/", className = "ws.AddResponse")
    @Action(input = "http://WS/Servicios/addRequest", output = "http://WS/Servicios/addResponse")
    public String add(
        @WebParam(name = "nombre", targetNamespace = "")
        String nombre,
        @WebParam(name = "precio", targetNamespace = "")
        float precio,
        @WebParam(name = "stock", targetNamespace = "")
        int stock,
        @WebParam(name = "proveedor", targetNamespace = "")
        String proveedor);

    /**
     * 
     * @param precio
     * @param proveedor
     * @param id
     * @param stock
     * @param nombre
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "update", targetNamespace = "http://WS/", className = "ws.Update")
    @ResponseWrapper(localName = "updateResponse", targetNamespace = "http://WS/", className = "ws.UpdateResponse")
    @Action(input = "http://WS/Servicios/updateRequest", output = "http://WS/Servicios/updateResponse")
    public String update(
        @WebParam(name = "id", targetNamespace = "")
        int id,
        @WebParam(name = "nombre", targetNamespace = "")
        String nombre,
        @WebParam(name = "precio", targetNamespace = "")
        float precio,
        @WebParam(name = "stock", targetNamespace = "")
        int stock,
        @WebParam(name = "proveedor", targetNamespace = "")
        String proveedor);

    /**
     * 
     * @param id
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "delete", targetNamespace = "http://WS/", className = "ws.Delete")
    @ResponseWrapper(localName = "deleteResponse", targetNamespace = "http://WS/", className = "ws.DeleteResponse")
    @Action(input = "http://WS/Servicios/deleteRequest", output = "http://WS/Servicios/deleteResponse")
    public String delete(
        @WebParam(name = "id", targetNamespace = "")
        int id);

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listarDatos", targetNamespace = "http://WS/", className = "ws.ListarDatos")
    @ResponseWrapper(localName = "listarDatosResponse", targetNamespace = "http://WS/", className = "ws.ListarDatosResponse")
    @Action(input = "http://WS/Servicios/listarDatosRequest", output = "http://WS/Servicios/listarDatosResponse")
    public String listarDatos();

    /**
     * 
     * @return
     *     returns java.util.List<ws.Producto>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listar", targetNamespace = "http://WS/", className = "ws.Listar")
    @ResponseWrapper(localName = "listarResponse", targetNamespace = "http://WS/", className = "ws.ListarResponse")
    @Action(input = "http://WS/Servicios/listarRequest", output = "http://WS/Servicios/listarResponse")
    public List<Producto> listar();

}