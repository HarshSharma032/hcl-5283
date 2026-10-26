import React,{ useEffect, useState } from 'react'

function UseFetchApi() {
    const [serverData,setServerData]=useState([]);
    useEffect(()=>{

        async function getData(){
            try{
                    const serverData=fetch("https://fakestoreapi.com/products");
                    const jsonData = await serverData.json();
                    console.log("Data from server is",jsonData);
                    setServerData(jsonData);

            }
            catch(e){
                console.log("Error is",e);


            }
        }
        getData();

    },[])
    return (
    <div>UseFetchApi
        
    </div>
    );
}
export default UseFetchApi;