import React from 'react';
import {Navbar, Nav} from 'react-bootstrap'

function NavbarComponent(){
    return(
        <Navbar bg="light" expand="lg">
            <Navbar.Brand href="#home">Boutique</Navbar.Brand>
            <Navbar.Toggle aria-controls="basic-navbar-nav" />
            <Navbar.Collapse id="basic-navbar-nav">
            <Nav className="mr-auto">
                <Nav.Link href="#cadastroUsuario">Cadastro Cliente</Nav.Link>
                <Nav.Link href="#Table">Clientes</Nav.Link>
                <Nav.Link href="#Compra">Compra</Nav.Link>
            </Nav>
            </Navbar.Collapse>
        </Navbar>
    )
}
export default NavbarComponent
