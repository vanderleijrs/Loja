import React from 'react';
import {Button} from 'react-bootstrap'
import CardComponent from '../components/Card/Card';
export default function Home() {
   {/* const json;*/}
        return (
            <div className='container'><br/>
                <CardComponent title="Cadastro de Cliente">
                <h1>Sistema de finanças</h1><br/>
                    <Button className="btn btn-primary btn-lg" href="#/cadastroUsuario" style={{marginLeft:10}}>Cadastrar Pessoa</Button>
                    <Button className="btn btn-primary btn-lg" href="#/Table" style={{marginLeft:10}}>Clientes</Button>
                    <Button className="btn btn-primary btn-lg" href="#/Compra"  style={{marginLeft:10}}>Compra</Button>
                </CardComponent>
            </div>
        )
}