import React from 'react';
import {Button, Form} from 'react-bootstrap'
import CardComponent from '../components/Card/Card';
export default function Home() {
   {/* const json;*/}
        return (
            <div className='container'><br/>
                <CardComponent title="Cadastro de Cliente">
                <h1>Sistema de finanças</h1><br/>
                <Form>
                  <Form.Group>
                    <Form.Control type="text" placeholder="Nome Cliente" />
                  </Form.Group>
                    <Button className="btn btn-primary btn-lg" href="#/cadastroUsuario" style={{marginLeft:10}}>Cadastrar Cliente</Button>
                    <Button className="btn btn-primary btn-lg" href="#/Table" style={{marginLeft:10}}> Procurar Clientes</Button>
                </Form>
                </CardComponent>
            </div>
        )
}