import pandas as pd
def create_dataframe(data, columns):
    """
    Create a pandas DataFrame from the given data and columns.

    Parameters:
    data (list of lists): The data to be included in the DataFrame.
    columns (list): The column names for the DataFrame.

    Returns:
    pd.DataFrame: The created DataFrame.
    """
    df = pd.DataFrame(data, columns=columns)
    return df 
print(create_dataframe)  