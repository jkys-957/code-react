import { Link } from 'react-router-dom';
import BasicLayout from '../layouts/BasicLayout';

const MainPage = () => {
  return (
    // <div>
    //   <div className="flex">
    //     <Link to={'/about'}>About</Link>  
    //   </div>
    // </div>
    <BasicLayout>
      <div className="text-3xl">
        Main Page
      </div>
    </BasicLayout>
  );
}

export default MainPage;