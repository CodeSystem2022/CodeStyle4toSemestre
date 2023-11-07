import { Link } from 'react-router-dom'
import { Card } from '../components/ui'
function NotFound() {
  return (
    <div className='h-[calc(100vh-64px)] flex justify-center items-center flex-col'>
        <Card>
            <h1 className='text-4xl font-bold my-2 text-center'>404</h1>
            <h3 className='text-xl text-center'>Página no encontrada</h3>
            <Link to='/' className='text-blue-500 hover:underline'>Volver al inicio</Link>
        </Card>
    </div>
  )
}

export default NotFound