from zeep import Client
from tkinter import CENTER, ttk
import tkinter


cliente = Client('http://localhost:8080/InventarioServer/Servicios?WSDL')

cliente2 = Client(
    'http://webservices.oorsprong.org/websamples.countryinfo/CountryInfoService.wso?WSDL')

ventana = tkinter.Tk()
ventana.geometry("500x300")

ventana.title("Agregar Producto")

etiqueta = tkinter.Label(ventana, text="Información del producto:")
etiqueta.place(x=10, y=10)

lbNombre = tkinter.Label(ventana, text="Nombre:")
lbNombre.place(x=10, y=35, width=50, height=30)
txtNombre = tkinter.Entry(ventana)
txtNombre.place(x=70, y=40, width=250, height=20)

lbPrecio = tkinter.Label(ventana, text="Precio:")
lbPrecio.place(x=10, y=75, width=35, height=30)
txtPrecio = tkinter.Entry(ventana)
txtPrecio.place(x=70, y=80, width=250, height=20)

lbStock = tkinter.Label(ventana, text="Stock:")
lbStock.place(x=10, y=110, width=40, height=30)
txtStock = tkinter.Entry(ventana)
txtStock.place(x=70, y=115, width=250, height=20)

lbProveedor = tkinter.Label(ventana, text="Proveedor:")
lbProveedor.place(x=10, y=150, width=60, height=30)
txtProveedor = tkinter.Entry(ventana)
txtProveedor.place(x=70, y=155, width=250, height=20)


def guardarDatos():

    if cliente.service.add(nombre=txtNombre.get(), precio=txtPrecio.get(), stock=txtStock.get(), proveedor=txtProveedor.get()):
        print("Producto Agregado")
    else:
        print("Error al agregar producto")


btnGuardar = tkinter.Button(ventana, text="Guardar",
                            bg='#0C8EFE', command=guardarDatos)
btnGuardar.place(x=240, y=200, width=80, height=20)


def mostrarDatos():
    lista = cliente.service.listarDatos()
    print(lista)


btnMostrar = tkinter.Button(ventana, text="Mostrar",
                            bg='#2ECC71', command=mostrarDatos)
btnMostrar.place(x=100, y=200, width=80, height=20)


def soapClient():
    soap2 = cliente2.service.FullCountryInfo('MX')
    print("\nInformación de México:\n")
    print(soap2)
    soap2 = cliente2.service.CountryFlag('NL')
    print("\nBandera de Países Bajos: " + soap2)
    soap2 = cliente2.service.CapitalCity('UY')
    print("\nCapital de Uruguay: " + soap2)
    soap2 = cliente2.service.CountryIntPhoneCode('US')
    print("\nCódigo internacional de teléfono de Estados Unidos de América: +" + soap2)
    soap2 = cliente2.service.ListOfContinentsByName()
    print("\nContinentes:")
    print(soap2)


mostrarDatos()
soapClient()
ventana.mainloop()
