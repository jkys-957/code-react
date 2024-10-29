import { useParams } from 'react-router-dom';
import ModifyComponent from '../../components/todo/ModifyComponent';

const ModifyPage = () => {

  const {tno} = useParams()

  //const navigate = useNavigate()

  // const moveToRead = () => {
  //   navigate({pathname:`/todo/read/${tno}`})
  // }

  // const moveToList = () => {
  //   navigate({pathname:`/todo/list`})
  // }

  return(
    // <div className="text-3xl font-extrabold">
    //   Todo Modify Page
    // </div>

    <div className="w-full p-4 bg-white">
      <div className="text-3xl font-extrabold">
        Todo Modify Page
      </div>
      <ModifyComponent tno={tno} />
    </div>
  );
}

export default ModifyPage;